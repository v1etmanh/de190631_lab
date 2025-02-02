package com.jmc.week1.excercise3;

import java.util.Scanner;

public class Test {



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            ConvertBaseSystem converter = new ConvertBaseSystem();

            while (true) {
                System.out.println("==== Base Conversion Program ====");
                System.out.println("1. Binary");
                System.out.println("2. Decimal");
                System.out.println("3. Hexadecimal");
                System.out.println("4. Exit");
                System.out.print("Choose the base of your input (1-3): ");
                int inputBase = scanner.nextInt();

                if (inputBase == 4) {
                    System.out.println("Exiting program...");
                    break;
                }

                System.out.print("Choose the base of your output (1-3): ");
                int outputBase = scanner.nextInt();

                System.out.print("Enter the input value: ");
                String inputValue = scanner.next();

                String result = "";
                 BaseSystem input;
                // Process based on user's choices
                try {
                    switch (inputBase) {
                        case 1: // Input is binary
                            switch (outputBase) {
                                case 1: // Binary to Binary (no change)
                                    result = inputValue;
                                    break;
                                case 2: // Binary to Decimal
                                    result = String.valueOf(converter.ConvertBinaryToDecimal(inputValue));
                                    break;
                                case 3: // Binary to Hexadecimal
                                    result = converter.ConvertBinaryToHexadicimal(inputValue);
                                    break;
                                default:
                                    System.out.println("Invalid output base choice!");
                                    continue;
                            }
                            break;
                        case 2: // Input is decimal
                            long decimalInput = Long.parseLong(inputValue);
                            switch (outputBase) {
                                case 1: // Decimal to Binary
                                    result = converter.ConvertDecimalToBinary(decimalInput);
                                    break;
                                case 2: // Decimal to Decimal (no change)
                                    result = inputValue;
                                    break;
                                case 3: // Decimal to Hexadecimal
                                    result = converter.ConvertDecimalToHexadcimal(decimalInput);
                                    break;
                                default:
                                    System.out.println("Invalid output base choice!");
                                    continue;
                            }
                            break;
                        case 3: // Input is hexadecimal
                            switch (outputBase) {
                                case 1: // Hexadecimal to Binary
                                    result = converter.ConvertHexadicimalToBinary(inputValue);
                                    break;
                                case 2: // Hexadecimal to Decimal
                                    result = String.valueOf(converter.ConvertHexadecimalToDecimal(inputValue));
                                    break;
                                case 3: // Hexadecimal to Hexadecimal (no change)
                                    result = inputValue.toUpperCase();
                                    break;
                                default:
                                    System.out.println("Invalid output base choice!");
                                    continue;
                            }
                            break;
                        default:
                            System.out.println("Invalid input base choice!");
                            continue;
                    }

                    // Print the result
                    System.out.println("Converted value: " + result);
                } catch (Exception e) {
                    System.out.println("Error: Invalid input or conversion.");
                }

                System.out.println("----------------------------------");
            }

            scanner.close();
        }


}
