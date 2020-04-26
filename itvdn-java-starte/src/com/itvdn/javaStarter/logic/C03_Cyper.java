package com.itvdn.javaStarter;

public class C03_Cyper {
    // Побитовые логические операции. (^)

    // Например:
    // Используя операцию XOR, мы можем зашифровать сообщение.
    // В таком виде шифрования используется один ключ, как для шифрования, так и для расшифровки.
    // Криптостойкость такого ключа, можно увеличить, если увеличить его длину.

    public static void main(String[] args) {
        short secretKey = 0b0101;   // Секретный ключ (длина - 16 bit).
        char character = 'A';      // Исходный символ для шифрования.

        System.out.println("Исходный символ: " + character + ", его код в кодовой таблице: " + (byte)character);

        // Зашифровываем символ. character = 0100 0001 (65)
        character = (char)(character ^ secretKey); // 0100 0001 ^  0000 0101
        System.out.println("Зашифрованный символ: " + character + ", его код в кодовой таблице: " + (byte) character);

        // Расшифровываем символ. character  = 0100 0100 (68)
        character = (char)(character ^ secretKey); // 0100 0100 ^ 0000 0101
        System.out.println("Расшифрованный символ: " + character + ", его код в кодовой таблице: " + (byte) character);
    }
}
