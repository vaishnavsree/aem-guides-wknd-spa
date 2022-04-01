package com.adobe.aem.guides.wknd.spa.react.core.models.impl;

import com.adobe.aem.guides.wknd.spa.react.core.models.LearnReactAEM;
import com.adobe.cq.export.json.ComponentExporter;
import com.adobe.cq.export.json.ExporterConstants;
import org.apache.commons.lang3.StringUtils;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Exporter;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = SlingHttpServletRequest.class,
        adapters = {LearnReactAEM.class, ComponentExporter.class},
        resourceType = LearnReactAEMImpl.RESOURCE_TYPE,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
@Exporter(name = ExporterConstants.SLING_MODEL_EXPORTER_NAME,
            extensions = ExporterConstants.SLING_MODEL_EXTENSION
)
public class LearnReactAEMImpl implements LearnReactAEM {

    static final String RESOURCE_TYPE = "wknd-spa-react/components/learning-react";

    @ValueMapValue
    private String displayText;

    @Override
    public String getDisplayText() {
        return StringUtils.isNotBlank(displayText) ? displayText.toUpperCase() : "Returned Empty String";
    }

    @Override
    public String getExportedType() {
        return LearnReactAEMImpl.RESOURCE_TYPE;
    }
}
