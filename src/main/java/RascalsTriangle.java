public class RascalsTriangle {

    public int rascalTriangleFormula(int row, int index) {
        //given an row and index, one can:
        //1)find diagonal: row-index
        //2)find place in diagonal: the index in row shares the place in the diagonal where the number is found
        //3)find number: multiply the diagonal*index, and add 1 one to accommodate the offset
        int diagonal = row - index;
        return (diagonal * index) + 1;
    }

}
