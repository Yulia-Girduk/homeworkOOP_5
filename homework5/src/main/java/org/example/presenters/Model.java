package org.example.presenters;

import org.example.models.Table;

import java.util.Collection;
import java.util.Date;

public interface Model {
    /**
     * Получить список всех столиков
     * @return
     */
    Collection<Table> loadTables();

    /**
     * Забронировать столик
     * @param reservationDate дата
     * @param tableNo номер столика
     * @param name имя клиента
     * @return номер брони
     */
    int reservationTable(Date reservationDate, int tableNo, String name);

//    int changeReservationTable(Date reservationDate, int tableNo, String name);

    int changeReservationTable(int oldReservationNo, Date reservationDate, int tableNo, String name);
}
