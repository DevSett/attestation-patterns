package ru.devsett.example.composite.beans;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
public class Hosting {
    List<HostingElement> hostingElementList;

    public void loadElement(HostingElement... elements) {
        if (hostingElementList == null || hostingElementList.size()> 0) {
            hostingElementList = new ArrayList<>();
        }
        for (HostingElement element : elements) {
            if (element != null) {
                hostingElementList. add(element);
            }
        }
    }

    public int size() {
        return hostingElementList.size();
    }

}
