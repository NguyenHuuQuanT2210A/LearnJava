package assignment10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class PhoneBook extends Phone {
    private ArrayList<PhoneNumber> phoneList = new ArrayList();

    public PhoneBook() {
    }

    public ArrayList<PhoneNumber> getPhoneList() {
        return this.phoneList;
    }

    void insertPhone(String name, String phone) {
        Iterator var3 = this.phoneList.iterator();

        PhoneNumber p;
        do {
            if (!var3.hasNext()) {
                PhoneNumber pn = new PhoneNumber(name, phone);
                this.phoneList.add(pn);
                return;
            }

            p = (PhoneNumber)var3.next();
        } while(!p.getName().equals(name));

        if (!p.getPhone().contains(phone)) {
            p.getPhone().add(phone);
        }
    }

    void removePhone(String name) {
        Iterator var2 = this.phoneList.iterator();

        PhoneNumber p;
        do {
            if (!var2.hasNext()) {
                return;
            }

            p = (PhoneNumber)var2.next();
        } while(!p.getName().equals(name));

        this.phoneList.remove(p);
    }

    void updatePhone(String name, String oldPhone, String newPhone) {
        Iterator var4 = this.phoneList.iterator();

        PhoneNumber p;
        do {
            if (!var4.hasNext()) {
                return;
            }

            p = (PhoneNumber)var4.next();
        } while(!p.getName().equals(name));

        if (p.getPhone().contains(oldPhone)) {
            p.getPhone().remove(oldPhone);
            p.getPhone().add(newPhone);
        }
    }

    PhoneNumber searchPhone(String name) {
        Iterator var2 = this.phoneList.iterator();

        PhoneNumber p;
        do {
            if (!var2.hasNext()) {
                return null;
            }

            p = (PhoneNumber)var2.next();
        } while(!p.getName().equals(name));

        return p;
    }

    void sort() {
        Collections.sort(this.phoneList, new Comparator<PhoneNumber>() {
            public int compare(PhoneNumber o1, PhoneNumber o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
    }
}
