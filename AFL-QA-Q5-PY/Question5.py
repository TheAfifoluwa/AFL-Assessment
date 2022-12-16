# Write a Python program that checks if a string is a palindrome;
# optionally, write a unit test to check your program's correctness.

def isPalindrome(string):
    if (string == string [::-1]):
        return "The string is a palindrome."
    else:
        return "The string is not a palidrome."

string = input("Enter String: ")

print(isPalindrome(string))
