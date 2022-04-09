package com.adobe.aem.guides.wknd.spa.react.core.models.impl;

import com.adobe.cq.export.json.ComponentExporter;

public interface Author extends ComponentExporter {

    String getFirstName();
    String getLastName();
    boolean getIsProfessor();
}
