import java.util.Arrays;
import java.util.Scanner;

public class HashTable {
    private static final int INITIAL_CAPACITY = 7;
    private static final double LOAD_FACTOR = 0.75;

    private Record[] table;
    private int size;

    public HashTable() {
        table = new Record[INITIAL_CAPACITY];
        size = 0;
    }

    public boolean insert(int accountNumber, String name, String address) {
        if (size >= LOAD_FACTOR * table.length) {
            resize();
        }

        int hashValue = hash(accountNumber);

        if (table[hashValue] == null) {
            table[hashValue] = new Record(accountNumber, name, address);
            size++;
            return true;
        } else {
            Record record = table[hashValue];
            while (record.next != null) {
                if (record.accountNumber == accountNumber) {
                    return false;
                }
                record = record.next;
            }
            if (record.accountNumber == accountNumber) {
                return false;
            }
            record.next = new Record(accountNumber, name, address);
            size++;
            return true;
        }
    }

    public boolean remove(int accountNumber) {
        int hashValue = hash(accountNumber);

        if (table[hashValue] == null) {
            return false;
        } else if (table[hashValue].accountNumber == accountNumber) {
            table[hashValue] = table[hashValue].next;
            size--;
            return true;
        } else {
            Record prev = table[hashValue];
            Record curr = prev.next;
            while (curr != null) {
                if (curr.accountNumber == accountNumber) {
                    prev.next = curr.next;
                    size--;
                    return true;
                }
                prev = curr;
                curr = curr.next;
            }
            return false;
        }
    }

    public Record find(int accountNumber) {
        int hashValue = hash(accountNumber);

        if (table[hashValue] == null) {
            return null;
        } else {
            Record record = table[hashValue];
            while (record != null) {
                if (record.accountNumber == accountNumber) {
                    return record;
                }
                record = record.next;
            }
            return null;
        }
    }

    public void print() {
        for (Record record : table) {
            while (record != null) {
                System.out.println("Account number: " + record.accountNumber);
                System.out.println("Name: " + record.name);
                System.out.println("Address: " + record.address);
                System.out.println();
                record = record.next;
            }
        }
    }

    private int hash(int accountNumber) {
        return Math.abs(accountNumber) % table.length;
    }

    private void resize() {
        Record[] oldTable = table;
        table = new Record[2 * oldTable.length];
        size = 0;
        for (Record record : oldTable) {
            while (record != null) {
                insert(record.accountNumber, record.name, record.address);
                record = record.next;
            }
        }
    }

    private static class Record {
        int accountNumber;
        String name;
        String address;
        Record next;

        public Record(int accountNumber, String name, String address) {
            this.accountNumber = accountNumber;
            this.name = name;
            this.address = address;
            next = null;
        }
    }
}



