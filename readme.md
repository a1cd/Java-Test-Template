# Lab 02.01: BMI Calculator
(see Veracross for a due date/time)

## Lab Description: 
Write a class called `BMICalc` that prompts the user with
two input statements:

1. Enter your height in feet and inches (format 6'2"):
2. Enter your weight in pounds:

The computer must wait for the user to respond to each question.
Following the input data from the user, the computer will calculate
the user's BMI, or body mass index, handled by the following
formula.

`BMI = weight(kg) / height(m)^2`

### Note:
The user is asked to supply their height in feet and inches measurement in the format F'I" where F
represents feet and I represents inches. **Your program does not need to handle invalid entry format
other than the user entering a value of 0 for their height;** instead, you should plan to use the `String`
methods `indexOf` and `substring` to extract the digit values from the user input.

## Important Conversion and Output Information
- 1 inch == 0.0254 meters
- 1 pound == 0.454 kg

### Note:
You will have to convert the supplied information from the user into the appropriate metric values.
For output conversion, you will be required to use a `DecimalFormat` object (see a link to a tutorial on
the Unit 2 course page) so that the user's BMI is output to the screen with a maximum of 2 decimal places
(including trailing zeros, if they exist).

## Sample input/output:
`Enter your height in feet and inches (Ex 6'1"): 5'11"` (user entry)
\
`Enter your weight in pounds: 175 `(user entry)
\
`Your BMI, expressed as weight(kg)/height(m)^2: 24.43 kg/m^2`

## Required Methods and private Data:
Your version of `BMICalc` must contain the following methods:
```java
/**
 * Convert English to metric units, perform the BMI calculation.
 */

NOTE: this method must properly handle bad data */
public static double computeBMI(int inches, int pounds)
/** Uses a Scanner to prompt the user for info, process the
* feet/inches conversion, calls the computeBMI method and prints the
* correct information. */
public static void main(String[] args)
```
