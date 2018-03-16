// Generated by delombok at Tue Mar 06 12:22:48 IST 2018
/*
Copyright 2017-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.

Licensed under the Apache License, Version 2.0 (the "License"). 
You may not use this file except in compliance with the License. 
A copy of the License is located at

   http://aws.amazon.com/apache2.0/

or in the "license" file accompanying this file. 
This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and limitations under the License.
*/
package com.amazonaws.kinesisvideo.parser.mkv;

import com.amazonaws.kinesisvideo.parser.ebml.EBMLElementMetaData;
import java.util.List;

/**
 * Class representing the end of a mkv master element.
 * It contains the metadata {@link EBMLElementMetaData} and the path if specified.
 */
public class MkvEndMasterElement extends MkvElement {
    private MkvEndMasterElement(EBMLElementMetaData elementMetaData, List<EBMLElementMetaData> elementPath) {
        super(elementMetaData, elementPath);
    }

    @Override
    public boolean isMaster() {
        return true;
    }

    @Override
    public void accept(MkvElementVisitor visitor) throws MkvElementVisitException {
        visitor.visit(this);
    }

    @Override
    public boolean equivalent(MkvElement other) {
        return typeEquals(other);
    }


    @SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    public static class MkvEndMasterElementBuilder {
        @SuppressWarnings("all")
        @javax.annotation.Generated("lombok")
        private EBMLElementMetaData elementMetaData;
        @SuppressWarnings("all")
        @javax.annotation.Generated("lombok")
        private List<EBMLElementMetaData> elementPath;

        @SuppressWarnings("all")
        @javax.annotation.Generated("lombok")
        MkvEndMasterElementBuilder() {
        }

        @SuppressWarnings("all")
        @javax.annotation.Generated("lombok")
        public MkvEndMasterElementBuilder elementMetaData(final EBMLElementMetaData elementMetaData) {
            this.elementMetaData = elementMetaData;
            return this;
        }

        @SuppressWarnings("all")
        @javax.annotation.Generated("lombok")
        public MkvEndMasterElementBuilder elementPath(final List<EBMLElementMetaData> elementPath) {
            this.elementPath = elementPath;
            return this;
        }

        @SuppressWarnings("all")
        @javax.annotation.Generated("lombok")
        public MkvEndMasterElement build() {
            return new MkvEndMasterElement(elementMetaData, elementPath);
        }

        @Override
        @SuppressWarnings("all")
        @javax.annotation.Generated("lombok")
        public String toString() {
            return "MkvEndMasterElement.MkvEndMasterElementBuilder(elementMetaData=" + this.elementMetaData + ", elementPath=" + this.elementPath + ")";
        }
    }

    @SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    public static MkvEndMasterElementBuilder builder() {
        return new MkvEndMasterElementBuilder();
    }

    @Override
    @SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    public String toString() {
        return "MkvEndMasterElement(super=" + super.toString() + ")";
    }
}
