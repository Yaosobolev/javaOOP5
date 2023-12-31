package lessons.src.ru.geekbrains.lesson5.models;

import java.util.ArrayList;
import java.util.Collection;

public class Table {
    private static int counter = 100;
    private final int no;

    private final Collection<Reservation> reservations = new ArrayList<>();

    {
        no = ++counter;
    }

    public int getNo() {
        return no;
    }



    public Collection<Reservation> getReservations() {
        return reservations;
    }

    @Override
    public String toString() {
        return String.format("Table #%d", no);
    }
}