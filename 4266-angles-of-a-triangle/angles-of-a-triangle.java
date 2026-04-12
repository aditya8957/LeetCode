class Solution {
    public double[] internalAngles(int[] sides) {
        Arrays.sort(sides);
        int a = sides[0];
        int b = sides[1];
        int c = sides[2];

        if (a + b > c && b + c > a && a + c > b) {

            double A = Math.toDegrees(Math.acos((b*b + c*c - a*a) / (2.0*b*c)));
            double B = Math.toDegrees(Math.acos((a*a + c*c - b*b) / (2.0*a*c)));
            double C = 180 - A - B;

            return new double[]{A, B, C};
        }

        // If invalid triangle
        return new double[]{};
    }
}