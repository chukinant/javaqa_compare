package ru.netology.javaqa.compare;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AviaSoulsTest {

    @Test
    public void shouldSearchAndSortByPrice () {
        AviaSouls avia = new AviaSouls();
        Ticket ticket1 = new Ticket("Moscow", "Kazan", 9_000, 9, 15);
        Ticket ticket2 = new Ticket("Kazan", "Moscow", 8_000, 9, 12);
        Ticket ticket3 = new Ticket("Moscow", "Kazan", 1_000, 9, 16);
        Ticket ticket4 = new Ticket("Beijing", "Tomsk", 7_000, 9, 19);
        Ticket ticket5 = new Ticket("Moscow", "Kazan", 2_000, 9, 20);
        Ticket ticket6 = new Ticket("Warsaw", "Berlin", 12_000, 9, 15);
        Ticket ticket7 = new Ticket("Moscow", "Kazan", 15_000, 9, 17);
        Ticket ticket8 = new Ticket("Moscow", "Kazan", 13_000, 9, 13);
        avia.add(ticket1);
        avia.add(ticket2);
        avia.add(ticket3);
        avia.add(ticket4);
        avia.add(ticket5);
        avia.add(ticket6);
        avia.add(ticket7);
        avia.add(ticket8);

        Ticket[] expected = {ticket3, ticket5, ticket1, ticket8, ticket7};
        Ticket[] actual = avia.search("Moscow", "Kazan");
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSearchNoItem () {
        AviaSouls avia = new AviaSouls();
        Ticket ticket1 = new Ticket("Moscow", "Kazan", 9_000, 9, 15);
        Ticket ticket2 = new Ticket("Kazan", "Moscow", 8_000, 9, 12);
        Ticket ticket3 = new Ticket("Moscow", "Kazan", 1_000, 9, 16);
        Ticket ticket4 = new Ticket("Beijing", "Tomsk", 7_000, 9, 19);
        Ticket ticket5 = new Ticket("Moscow", "Kazan", 2_000, 9, 20);
        Ticket ticket6 = new Ticket("Warsaw", "Berlin", 12_000, 9, 15);
        Ticket ticket7 = new Ticket("Moscow", "Kazan", 15_000, 9, 17);
        Ticket ticket8 = new Ticket("Moscow", "Kazan", 13_000, 9, 13);
        avia.add(ticket1);
        avia.add(ticket2);
        avia.add(ticket3);
        avia.add(ticket4);
        avia.add(ticket5);
        avia.add(ticket6);
        avia.add(ticket7);
        avia.add(ticket8);

        Ticket[] expected = {};
        Ticket[] actual = avia.search("Paris", "Kazan");
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSearchOneItem () {
        AviaSouls avia = new AviaSouls();
        Ticket ticket1 = new Ticket("Moscow", "Kazan", 9_000, 9, 15);
        Ticket ticket2 = new Ticket("Kazan", "Moscow", 8_000, 9, 12);
        Ticket ticket3 = new Ticket("Moscow", "Kazan", 1_000, 9, 16);
        Ticket ticket4 = new Ticket("Beijing", "Tomsk", 7_000, 9, 19);
        Ticket ticket5 = new Ticket("Moscow", "Kazan", 2_000, 9, 20);
        Ticket ticket6 = new Ticket("Warsaw", "Berlin", 12_000, 9, 15);
        Ticket ticket7 = new Ticket("Moscow", "Kazan", 15_000, 9, 17);
        Ticket ticket8 = new Ticket("Moscow", "Kazan", 13_000, 9, 13);
        avia.add(ticket1);
        avia.add(ticket2);
        avia.add(ticket3);
        avia.add(ticket4);
        avia.add(ticket5);
        avia.add(ticket6);
        avia.add(ticket7);
        avia.add(ticket8);

        Ticket[] expected = {ticket4};
        Ticket[] actual = avia.search("Beijing", "Tomsk");
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSearchAndSortByTime () {
        AviaSouls avia = new AviaSouls();
        Ticket ticket1 = new Ticket("Moscow", "Kazan", 9_000, 9, 15);
        Ticket ticket2 = new Ticket("Kazan", "Moscow", 8_000, 9, 12);
        Ticket ticket3 = new Ticket("Moscow", "Kazan", 1_000, 9, 12);
        Ticket ticket4 = new Ticket("Beijing", "Tomsk", 7_000, 9, 19);
        Ticket ticket5 = new Ticket("Moscow", "Kazan", 2_000, 9, 20);
        Ticket ticket6 = new Ticket("Warsaw", "Berlin", 12_000, 9, 15);
        Ticket ticket7 = new Ticket("Moscow", "Kazan", 15_000, 9, 12);
        Ticket ticket8 = new Ticket("Moscow", "Kazan", 13_000, 9, 13);
        avia.add(ticket1);
        avia.add(ticket2);
        avia.add(ticket3);
        avia.add(ticket4);
        avia.add(ticket5);
        avia.add(ticket6);
        avia.add(ticket7);
        avia.add(ticket8);

        TicketTimeComparator TimeComparator = new TicketTimeComparator();

        Ticket[] expected = {ticket3, ticket7, ticket8, ticket1, ticket5 };
        Ticket[] actual = avia.searchAndSortBy("Moscow", "Kazan", TimeComparator);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSearchAndSortByTimeNoItems () {
        AviaSouls avia = new AviaSouls();
        Ticket ticket1 = new Ticket("Moscow", "Kazan", 9_000, 9, 15);
        Ticket ticket2 = new Ticket("Kazan", "Moscow", 8_000, 9, 12);
        Ticket ticket3 = new Ticket("Moscow", "Kazan", 1_000, 9, 12);
        Ticket ticket4 = new Ticket("Beijing", "Tomsk", 7_000, 9, 19);
        Ticket ticket5 = new Ticket("Moscow", "Kazan", 2_000, 9, 20);
        Ticket ticket6 = new Ticket("Warsaw", "Berlin", 12_000, 9, 15);
        Ticket ticket7 = new Ticket("Moscow", "Kazan", 15_000, 9, 12);
        Ticket ticket8 = new Ticket("Moscow", "Kazan", 13_000, 9, 13);
        avia.add(ticket1);
        avia.add(ticket2);
        avia.add(ticket3);
        avia.add(ticket4);
        avia.add(ticket5);
        avia.add(ticket6);
        avia.add(ticket7);
        avia.add(ticket8);

        TicketTimeComparator TimeComparator = new TicketTimeComparator();

        Ticket[] expected = {};
        Ticket[] actual = avia.searchAndSortBy("Paris", "Kazan", TimeComparator);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSearchAndSortByTimeOneItem () {
        AviaSouls avia = new AviaSouls();
        Ticket ticket1 = new Ticket("Moscow", "Kazan", 9_000, 9, 15);
        Ticket ticket2 = new Ticket("Kazan", "Moscow", 8_000, 9, 12);
        Ticket ticket3 = new Ticket("Moscow", "Kazan", 1_000, 9, 12);
        Ticket ticket4 = new Ticket("Beijing", "Tomsk", 7_000, 9, 19);
        Ticket ticket5 = new Ticket("Moscow", "Kazan", 2_000, 9, 20);
        Ticket ticket6 = new Ticket("Warsaw", "Berlin", 12_000, 9, 15);
        Ticket ticket7 = new Ticket("Moscow", "Kazan", 15_000, 9, 12);
        Ticket ticket8 = new Ticket("Moscow", "Kazan", 13_000, 9, 13);
        avia.add(ticket1);
        avia.add(ticket2);
        avia.add(ticket3);
        avia.add(ticket4);
        avia.add(ticket5);
        avia.add(ticket6);
        avia.add(ticket7);
        avia.add(ticket8);

        TicketTimeComparator TimeComparator = new TicketTimeComparator();

        Ticket[] expected = {ticket6};
        Ticket[] actual = avia.searchAndSortBy("Warsaw", "Berlin", TimeComparator);
        Assertions.assertArrayEquals(expected, actual);
    }

}
