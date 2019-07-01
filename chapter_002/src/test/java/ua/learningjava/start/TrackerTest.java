package ua.learningjava.start;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * TrackerTest.
 *
 * @author Stefiniv Pavlo
 * @version $Id$
 * @since 0.1
 */
public class TrackerTest {

    @org.junit.jupiter.api.Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1", "testDescription", 123L);
        tracker.add(item);
        assertThat(tracker.findAll()[0], is(item));
    }

    @org.junit.jupiter.api.Test
    public void whenReplaceNameThenReturnNewName() {
        Tracker tracker = new Tracker();
        Item previous = new Item("test1", "testDescription", 123L);
        tracker.add(previous);
        Item next = new Item("test2", "testDescription2", 1234L);
        next.setId(previous.getId());
        tracker.replace(previous.getId(), next);
        assertThat(tracker.findById(previous.getId()).getName(), Matchers.is("test2"));
    }

    @org.junit.jupiter.api.Test
    public void whenDeleteItemThenReturnArrayWithOutItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1", "testDescription", 123L);
        Item item2 = new Item("test2", "TestDescription2", 1234L);
        tracker.add(item);
        tracker.add(item2);
        tracker.delete(item.getId());
        assertThat(tracker.findAll()[0], is(item2));
    }

    @org.junit.jupiter.api.Test
    public void whenFindByName() {
        Tracker tracker1 = new Tracker();
        Item one = new Item("test1", "testDescription1", 123L);
        Item two = new Item("test2", "TestDescription2", 12345L);
        Item three = new Item("test3", "TestDescription3", 123456L);
        Item four = new Item("test4", "TestDescription4", 1234567L);

        tracker1.add(one);
        tracker1.add(three);
        tracker1.add(two);
        tracker1.add(four);

        Item[] result = {two};
        assertThat(tracker1.findByName("test2"), Matchers.is(result));

    }

    @org.junit.jupiter.api.Test
    public void findItemById() {
        Tracker tracker = new Tracker();
        Item one = new Item("test1", "testDescription1", 1L);
        Item two = new Item("test4", "testDescription2", 12L);
        Item three = new Item("test3", "testDescription3", 123L);
        Item four = new Item("test4", "testDescription4", 1234L);
        tracker.add(one);
        tracker.add(two);
        tracker.add(three);
        tracker.add(four);
        Item result = tracker.findById(four.getId());
        assertThat(result.getId(), is(four.getId()));
    }

    @Test
    public void whenTwoItemsAddedInTrackerEqualsAnotherArray() {
        Tracker tracker1 = new Tracker();
        Item one = new Item("t1", "d1", 1l);
        Item two = new Item("t2", "d2", 12l);
        tracker1.add(one);
        tracker1.add(two);
        Item[] result = {one, two};
        assertThat(tracker1.findAll(), Matchers.is(result));

    }
}