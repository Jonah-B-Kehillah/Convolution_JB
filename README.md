# Convolution_JB
###### By *Jonah B.*

An implementation of 1D convolution

## Compare to polynomial multiplication
Functionally, multiplying polynomials and calculating 1d convolutions (a convolution of two arrays) can be very similar 
operations.

As I showed in my testing of `convolve()`, the convolution of the arrays `[1, 2, 3]` and `[4, 5, 6]` 
returns `[4, 13, 28, 27, 18]`. 

Now consider the result of multiplying the two polynomials *1+2x+3x<sup>2</sup>* with *4+5x+6x<sup>2</sup>*. The 
product of this multiplication is *4+13x+28x<sup>2</sup>+27x<sup>3</sup>+18x<sup>4</sup>*.

As you can see, these two operations return the same result.

Convolution can be thought of as multiplying two polynomials, where the values of each input array conform to the 
coefficients of the polynomials to be multiplied. Inversely, polynomial multiplication can be though of as taking 
the convolution of each polynomial's coefficients, and then re-inserting x<sup>n</sup> to turn the result into a new 
polynomial.

From this, it is also possible to calculate a convolution by hand. You can use the same box method as used for 
finding polynomials. Arrange the two inputs as the rows and columns, and for each place in the box, write in the 
product of the row and the column, then find the value of each diagonal, giving you the result of the convolution. 
This is the method that I used for my implementation of `convolve()`, however, I directly add my products to each 
'diagonal,' instead of calculating the full grid. 

## Classes and methods
- `Main`
  - `main()`
- `Convolution`
  - `int[] convolve(int[], int[])`

## Acknowledgements
- Mr. Christopher Kuszmaul
- 3Blue1Brown ([source](https://www.youtube.com/watch?v=KuXjwB4LzSA))