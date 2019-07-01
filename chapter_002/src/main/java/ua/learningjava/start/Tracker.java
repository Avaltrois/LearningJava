package ua.learningjava.start;

import java.util.Arrays;

public class Tracker {
    private Item[] items = new Item[100];
    private int position = 0;
    private int number = 0;

    public Item add(Item item) {
        item.setId(this.generateId());
        this.items[this.position++] = item;
        return item;
    }

    public void replace(String id, Item item) {
        for (int i = 0; i < position; i++) {
            if (this.items[i].getId().equals(id)) {
                this.items[i] = item;
                break;
            }
        }
    }

    public void delete(String id) {
        for (int i = 0; i < position; i++) {
            if (this.items[i].getId().equals(id)) {
                System.arraycopy(this.items, i + 1, this.items, i, items.length - i - 1);
                break;
            }
        }
    }

    public Item findById(String id) {
        Item result = null;
        for (int i = 0; i <= position; i++) {
            if (this.items[i].getId().equals(id)) {
                result = this.items[i];
                break;
            }
        }
        return result;
    }


    public String generateId() {
        Long id = System.currentTimeMillis() * (long) (Math.random() * 101);
        return id.toString();
    }

    Item[] findAll() {
        return Arrays.copyOf(this.items, this.position);
    }

    Item[] findByName(String key) {
        Item[] result = new Item[1];
        for (int i = 0; i < position; i++) {
            if (items[i].getName().equals(key)) {
                result[0] = items[i];
            }

        }
        return result;
    }

}
