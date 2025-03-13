#### **TASK**

Należy napisać tylko jedną klasę z metodą main.

W tej metodzie prosimy, użytkownika o podanie liczby z przedziału 0.1-9999.99, a następnie liczymy pierwiastek z tej liczby (pakiet Math).

W przypadku wystąpienia wyjątku program ma napisać zrozumiały dla użytkownika komentarz (należy to obsłużyć za pomocą bloku try-catch) np.
- It is not a number.
- Number should be positive.
- Number is out of given range.

W razie potrzeby należy samemu rzucić wyjątek napisany przez siebie lub już istniejący.

---

```
Enter a number between 0,1 and 9999,99: -1
Number should be positive.

Enter a number between 0,1 and 9999,99: 16
Square root of 16.0 is ~ 4,00

Enter a number between 0,1 and 9999,99: 1000000
Number is out of given range.

Enter a number between 0.1 and 9999.99: abc
It is not a number.

Enter a number between 0.1 and 9999.99: 0,2
Square root of 0,20 is ~ 0,45

Enter a number between 0.1 and 9999.99: 0.2
Square root of 0,20 is ~ 0,45
```