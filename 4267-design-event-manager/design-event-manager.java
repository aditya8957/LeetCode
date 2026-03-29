class Pair{
    int eId;
    int pr;
    Pair(int pr, int eId){
        this.pr = pr;
        this.eId = eId;
    }
}
class EventManager {

    int[][] events;
    HashMap<Integer, Integer> map;
    PriorityQueue<Pair> pq;

    public EventManager(int[][] events) {

        this.events = events;
        this.map = new HashMap<>();
        pq = new PriorityQueue<>(
            (a, b) -> {
                if (b.pr != a.pr) return b.pr - a.pr;
                return a.eId - b.eId;
            }
        );

        for(int i=0; i<events.length; i++){
            map.put(events[i][0], events[i][1]);
            pq.add(new Pair(events[i][1],events[i][0]));
        }
    }
    
    public void updatePriority(int eventId, int newPriority) {
        map.put(eventId, newPriority);
        pq.add(new Pair(newPriority, eventId));
    }
    
    public int pollHighest() {

        while (!pq.isEmpty()) {

            Pair top = pq.poll();
            if(map.containsKey(top.eId) && map.get(top.eId) == top.pr){
                map.remove(top.eId); 
                return top.eId;
            }

        }
        return -1;
    }
}

/**
 * Your EventManager object will be instantiated and called as such:
 * EventManager obj = new EventManager(events);
 * obj.updatePriority(eventId,newPriority);
 * int param_2 = obj.pollHighest();
 */