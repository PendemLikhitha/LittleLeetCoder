class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int original = image[sr][sc];

        if(original == color){
            return image;
        }
        int rows = image.length;
        int cols = image[0].length;
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{sr, sc});
        image[sr][sc] = color;
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};
        while(!q.isEmpty()){
            int[] cell = q.poll();
            int r = cell[0];
            int c = cell[1];
            for(int i = 0; i<4; i++){
                int nr = r+dr[i];
                int nc = c + dc[i];
                if(nr>=0 && nr<rows && nc>=0 && nc<cols && image[nr][nc]==original){
                    image[nr][nc]=color;
                    q.offer(new int[]{nr,nc});
                }
            }
        }
        return image;
    }
}