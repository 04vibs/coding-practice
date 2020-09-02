var min(int a, int b, int c) {
    return ((a<b?a:b))?((a<c)?a:c):((b<c)?b:c);
 }
 
 function subMatWithOne() {
    var subMat[ROW][COL];
    var maxSize, iMax, jMax;
 
    for(var i = 0; i < ROW; i++)    //copy first row of matrix to sub matrix
       subMat[i][0] = matrix[i][0];
 
    for(var j = 0; j < COL; j++)    //copy first column of matrix to sub matrix
       subMat[0][j] = matrix[0][j];
 
    for(var i = 1; i < ROW; i++) {
       for(var j = 1; j < COL; j++) {
          if(matrix[i][j] == 1)    //find minimum of left, top and diagonal element + 1
             subMat[i][j] = min(subMat[i][j-1], subMat[i-1][j], subMat[i-1][j-1]) + 1;
          else
             subMat[i][j] = 0;    //if item is 0, put only 0
       }  
    }
 
    maxSize = subMat[0][0]; iMax = 0; jMax = 0;
    for(var i = 0; i < ROW; i++) {    //find the order of sub square matrix
 
       for(var j = 0; j < COL; j++) {
          if(maxSize < subMat[i][j]) {
 
             maxSize = subMat[i][j];
             iMax = i;
             jMax = j;
          }      
       }                
    }  
  
    cout << "Subsquare matrix: "<<endl;
    for(var i = iMax; i > iMax - maxSize; i--) {    //print the submatrix using max size
       for(var j = jMax; j > jMax - maxSize; j--) {
          console.log( matrix[i][j]);
       }
 //      cout << endl;
    }
 }  
  
 int main() {
    subMatWithOne();
 } 