package org.example.models;

import java.util.ArrayList;
import java.util.Collection;

public class Table {
    private static int counter;

    private final int no;

    {
        no = ++counter;
    }

    private final ArrayList reservations = new ArrayList<>();

    public ArrayList getReservations() {
        return reservations;
    }

    public int getNo() {
        return no;
    }

    @Override
    public String toString() {
        return String.format("Столик #%d", no);
    }
}
