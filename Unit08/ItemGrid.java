package Unit08;

public class ItemGrid {
    
    private Item[][] grid;


    public ItemGrid() {
        grid = new Item[][] {
            {new Item("acorn", 7), new Item("book", 10), new Item("carrot", 8), new Item("desk", 9)}, 
            {new Item("egg", 5), new Item("flag", 8), new Item("globe", 8), new Item("harp", 9)}, 
            {new Item("island", 7), new Item("jacket", 19), new Item("kale", 8), new Item("lunch", 16)}
        };
    }

    public boolean isValid(int xPos, int yPos){
        if(xPos < 0){
            return false;
        }
        else if(xPos > grid[0].length - 1){
            return false;
        }
        else if(yPos < 0){
            return false;
        }
        else if(yPos > grid.length - 1){
            return false;
        }
        else {
            return true;
        }
    }

    public String mostValuableNeighbor(int r, int c){
        if(grid[r][c].isValid == true){
            
        }
    }
    
    public double findAverage(){
        int total = 0;
        int newvalue = 0;
        int maxnumbers = 0;
        double truetotal = 0;

        for(int col = 0; col < grid[0].length; col++){
            for(int row = 0; row < grid.length; row++){
                newvalue = grid[row][col].getValue();
                total += newvalue;
            }
        }
        maxnumbers = grid[0].length * grid.length;
        truetotal = total/(double)maxnumbers;
        return truetotal;
    }

    public static void main(String[] args) {
        ItemGrid ig = new ItemGrid();
        System.out.println(ig.mostValuableNeighbor(0, 2));
        System.out.println(ig.mostValuableNeighbor(1, 1));
        System.out.println(ig.mostValuableNeighbor(2, 0));
        System.out.println(ig.mostValuableNeighbor(2, 3));


    }
}
