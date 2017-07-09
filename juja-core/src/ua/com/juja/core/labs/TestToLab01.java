package ua.com.juja.core.labs;

import ua.com.juja.core.JujaAwesome;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class TestToLab01 {
    public static void main(String[] args) {
        PrintStream out = System.out;
        String lastBuffer = null;
        try {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            PrintStream wrappedStream = new PrintStream(outputStream);
            System.setOut(wrappedStream);

            JujaAwesome.printJujaIsAwesome();
            lastBuffer = new String(outputStream.toByteArray()).trim();

        } finally {
            System.setOut(out);
        }

        if (lastBuffer == null)
            throw new AssertionError("Expected to be printed <Juja is awesome> but found nothing");

        if (!lastBuffer.equalsIgnoreCase("Juja is awesome!"))
            throw new AssertionError("Expected to be printed <Juja is awesome!> but found <" + lastBuffer + ">");

        System.out.print("OK");
    }

}

