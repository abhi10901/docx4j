/*
 *  Copyright 2010, Plutext Pty Ltd.
 *   
 *  This file is part of docx4j.

    docx4j is licensed under the Apache License, Version 2.0 (the "License"); 
    you may not use this file except in compliance with the License. 

    You may obtain a copy of the License at 

        http://www.apache.org/licenses/LICENSE-2.0 

    Unless required by applicable law or agreed to in writing, software 
    distributed under the License is distributed on an "AS IS" BASIS, 
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
    See the License for the specific language governing permissions and 
    limitations under the License.

 */


package org.pptx4j.pml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.docx4j.dml.CTPositiveSize2D;
import org.docx4j.dml.CTTextListStyle;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sldMasterIdLst" type="{http://schemas.openxmlformats.org/presentationml/2006/main}CT_SlideMasterIdList" minOccurs="0"/>
 *         &lt;element name="notesMasterIdLst" type="{http://schemas.openxmlformats.org/presentationml/2006/main}CT_NotesMasterIdList" minOccurs="0"/>
 *         &lt;element name="handoutMasterIdLst" type="{http://schemas.openxmlformats.org/presentationml/2006/main}CT_HandoutMasterIdList" minOccurs="0"/>
 *         &lt;element name="sldIdLst" type="{http://schemas.openxmlformats.org/presentationml/2006/main}CT_SlideIdList" minOccurs="0"/>
 *         &lt;element name="sldSz" type="{http://schemas.openxmlformats.org/presentationml/2006/main}CT_SlideSize" minOccurs="0"/>
 *         &lt;element name="notesSz" type="{http://schemas.openxmlformats.org/drawingml/2006/main}CT_PositiveSize2D"/>
 *         &lt;element name="smartTags" type="{http://schemas.openxmlformats.org/presentationml/2006/main}CT_SmartTags" minOccurs="0"/>
 *         &lt;element name="embeddedFontLst" type="{http://schemas.openxmlformats.org/presentationml/2006/main}CT_EmbeddedFontList" minOccurs="0"/>
 *         &lt;element name="custShowLst" type="{http://schemas.openxmlformats.org/presentationml/2006/main}CT_CustomShowList" minOccurs="0"/>
 *         &lt;element name="photoAlbum" type="{http://schemas.openxmlformats.org/presentationml/2006/main}CT_PhotoAlbum" minOccurs="0"/>
 *         &lt;element name="custDataLst" type="{http://schemas.openxmlformats.org/presentationml/2006/main}CT_CustomerDataList" minOccurs="0"/>
 *         &lt;element name="kinsoku" type="{http://schemas.openxmlformats.org/presentationml/2006/main}CT_Kinsoku" minOccurs="0"/>
 *         &lt;element name="defaultTextStyle" type="{http://schemas.openxmlformats.org/drawingml/2006/main}CT_TextListStyle" minOccurs="0"/>
 *         &lt;element name="modifyVerifier" type="{http://schemas.openxmlformats.org/presentationml/2006/main}CT_ModifyVerifier" minOccurs="0"/>
 *         &lt;element name="extLst" type="{http://schemas.openxmlformats.org/presentationml/2006/main}CT_ExtensionList" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="serverZoom" type="{http://schemas.openxmlformats.org/drawingml/2006/main}ST_Percentage" default="50000" />
 *       &lt;attribute name="firstSlideNum" type="{http://www.w3.org/2001/XMLSchema}int" default="1" />
 *       &lt;attribute name="showSpecialPlsOnTitleSld" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *       &lt;attribute name="rtl" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="removePersonalInfoOnSave" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="compatMode" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="strictFirstAndLastChars" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *       &lt;attribute name="embedTrueTypeFonts" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="saveSubsetFonts" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="autoCompressPictures" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *       &lt;attribute name="bookmarkIdSeed" type="{http://schemas.openxmlformats.org/presentationml/2006/main}ST_BookmarkIdSeed" default="1" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "sldMasterIdLst",
    "notesMasterIdLst",
    "handoutMasterIdLst",
    "sldIdLst",
    "sldSz",
    "notesSz",
    "smartTags",
    "embeddedFontLst",
    "custShowLst",
    "photoAlbum",
    "custDataLst",
    "kinsoku",
    "defaultTextStyle",
    "modifyVerifier",
    "extLst"
})
@XmlRootElement(name = "presentation")
public class Presentation {

    protected CTSlideMasterIdList sldMasterIdLst;
    protected CTNotesMasterIdList notesMasterIdLst;
    protected CTHandoutMasterIdList handoutMasterIdLst;
    protected CTSlideIdList sldIdLst;
    protected CTSlideSize sldSz;
    @XmlElement(required = true)
    protected CTPositiveSize2D notesSz;
    protected CTSmartTags smartTags;
    protected CTEmbeddedFontList embeddedFontLst;
    protected CTCustomShowList custShowLst;
    protected CTPhotoAlbum photoAlbum;
    protected CTCustomerDataList custDataLst;
    protected CTKinsoku kinsoku;
    protected CTTextListStyle defaultTextStyle;
    protected CTModifyVerifier modifyVerifier;
    protected CTExtensionList extLst;
    @XmlAttribute
    protected Integer serverZoom;
    @XmlAttribute
    protected Integer firstSlideNum;
    @XmlAttribute
    protected Boolean showSpecialPlsOnTitleSld;
    @XmlAttribute
    protected Boolean rtl;
    @XmlAttribute
    protected Boolean removePersonalInfoOnSave;
    @XmlAttribute
    protected Boolean compatMode;
    @XmlAttribute
    protected Boolean strictFirstAndLastChars;
    @XmlAttribute
    protected Boolean embedTrueTypeFonts;
    @XmlAttribute
    protected Boolean saveSubsetFonts;
    @XmlAttribute
    protected Boolean autoCompressPictures;
    @XmlAttribute
    protected Long bookmarkIdSeed;

    /**
     * Gets the value of the sldMasterIdLst property.
     * 
     * @return
     *     possible object is
     *     {@link CTSlideMasterIdList }
     *     
     */
    public CTSlideMasterIdList getSldMasterIdLst() {
        return sldMasterIdLst;
    }

    /**
     * Sets the value of the sldMasterIdLst property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTSlideMasterIdList }
     *     
     */
    public void setSldMasterIdLst(CTSlideMasterIdList value) {
        this.sldMasterIdLst = value;
    }

    /**
     * Gets the value of the notesMasterIdLst property.
     * 
     * @return
     *     possible object is
     *     {@link CTNotesMasterIdList }
     *     
     */
    public CTNotesMasterIdList getNotesMasterIdLst() {
        return notesMasterIdLst;
    }

    /**
     * Sets the value of the notesMasterIdLst property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTNotesMasterIdList }
     *     
     */
    public void setNotesMasterIdLst(CTNotesMasterIdList value) {
        this.notesMasterIdLst = value;
    }

    /**
     * Gets the value of the handoutMasterIdLst property.
     * 
     * @return
     *     possible object is
     *     {@link CTHandoutMasterIdList }
     *     
     */
    public CTHandoutMasterIdList getHandoutMasterIdLst() {
        return handoutMasterIdLst;
    }

    /**
     * Sets the value of the handoutMasterIdLst property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTHandoutMasterIdList }
     *     
     */
    public void setHandoutMasterIdLst(CTHandoutMasterIdList value) {
        this.handoutMasterIdLst = value;
    }

    /**
     * Gets the value of the sldIdLst property.
     * 
     * @return
     *     possible object is
     *     {@link CTSlideIdList }
     *     
     */
    public CTSlideIdList getSldIdLst() {
        return sldIdLst;
    }

    /**
     * Sets the value of the sldIdLst property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTSlideIdList }
     *     
     */
    public void setSldIdLst(CTSlideIdList value) {
        this.sldIdLst = value;
    }

    /**
     * Gets the value of the sldSz property.
     * 
     * @return
     *     possible object is
     *     {@link CTSlideSize }
     *     
     */
    public CTSlideSize getSldSz() {
        return sldSz;
    }

    /**
     * Sets the value of the sldSz property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTSlideSize }
     *     
     */
    public void setSldSz(CTSlideSize value) {
        this.sldSz = value;
    }

    /**
     * Gets the value of the notesSz property.
     * 
     * @return
     *     possible object is
     *     {@link CTPositiveSize2D }
     *     
     */
    public CTPositiveSize2D getNotesSz() {
        return notesSz;
    }

    /**
     * Sets the value of the notesSz property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTPositiveSize2D }
     *     
     */
    public void setNotesSz(CTPositiveSize2D value) {
        this.notesSz = value;
    }

    /**
     * Gets the value of the smartTags property.
     * 
     * @return
     *     possible object is
     *     {@link CTSmartTags }
     *     
     */
    public CTSmartTags getSmartTags() {
        return smartTags;
    }

    /**
     * Sets the value of the smartTags property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTSmartTags }
     *     
     */
    public void setSmartTags(CTSmartTags value) {
        this.smartTags = value;
    }

    /**
     * Gets the value of the embeddedFontLst property.
     * 
     * @return
     *     possible object is
     *     {@link CTEmbeddedFontList }
     *     
     */
    public CTEmbeddedFontList getEmbeddedFontLst() {
        return embeddedFontLst;
    }

    /**
     * Sets the value of the embeddedFontLst property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTEmbeddedFontList }
     *     
     */
    public void setEmbeddedFontLst(CTEmbeddedFontList value) {
        this.embeddedFontLst = value;
    }

    /**
     * Gets the value of the custShowLst property.
     * 
     * @return
     *     possible object is
     *     {@link CTCustomShowList }
     *     
     */
    public CTCustomShowList getCustShowLst() {
        return custShowLst;
    }

    /**
     * Sets the value of the custShowLst property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTCustomShowList }
     *     
     */
    public void setCustShowLst(CTCustomShowList value) {
        this.custShowLst = value;
    }

    /**
     * Gets the value of the photoAlbum property.
     * 
     * @return
     *     possible object is
     *     {@link CTPhotoAlbum }
     *     
     */
    public CTPhotoAlbum getPhotoAlbum() {
        return photoAlbum;
    }

    /**
     * Sets the value of the photoAlbum property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTPhotoAlbum }
     *     
     */
    public void setPhotoAlbum(CTPhotoAlbum value) {
        this.photoAlbum = value;
    }

    /**
     * Gets the value of the custDataLst property.
     * 
     * @return
     *     possible object is
     *     {@link CTCustomerDataList }
     *     
     */
    public CTCustomerDataList getCustDataLst() {
        return custDataLst;
    }

    /**
     * Sets the value of the custDataLst property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTCustomerDataList }
     *     
     */
    public void setCustDataLst(CTCustomerDataList value) {
        this.custDataLst = value;
    }

    /**
     * Gets the value of the kinsoku property.
     * 
     * @return
     *     possible object is
     *     {@link CTKinsoku }
     *     
     */
    public CTKinsoku getKinsoku() {
        return kinsoku;
    }

    /**
     * Sets the value of the kinsoku property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTKinsoku }
     *     
     */
    public void setKinsoku(CTKinsoku value) {
        this.kinsoku = value;
    }

    /**
     * Gets the value of the defaultTextStyle property.
     * 
     * @return
     *     possible object is
     *     {@link CTTextListStyle }
     *     
     */
    public CTTextListStyle getDefaultTextStyle() {
        return defaultTextStyle;
    }

    /**
     * Sets the value of the defaultTextStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTTextListStyle }
     *     
     */
    public void setDefaultTextStyle(CTTextListStyle value) {
        this.defaultTextStyle = value;
    }

    /**
     * Gets the value of the modifyVerifier property.
     * 
     * @return
     *     possible object is
     *     {@link CTModifyVerifier }
     *     
     */
    public CTModifyVerifier getModifyVerifier() {
        return modifyVerifier;
    }

    /**
     * Sets the value of the modifyVerifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTModifyVerifier }
     *     
     */
    public void setModifyVerifier(CTModifyVerifier value) {
        this.modifyVerifier = value;
    }

    /**
     * Gets the value of the extLst property.
     * 
     * @return
     *     possible object is
     *     {@link CTExtensionList }
     *     
     */
    public CTExtensionList getExtLst() {
        return extLst;
    }

    /**
     * Sets the value of the extLst property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTExtensionList }
     *     
     */
    public void setExtLst(CTExtensionList value) {
        this.extLst = value;
    }

    /**
     * Gets the value of the serverZoom property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getServerZoom() {
        if (serverZoom == null) {
            return  50000;
        } else {
            return serverZoom;
        }
    }

    /**
     * Sets the value of the serverZoom property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setServerZoom(Integer value) {
        this.serverZoom = value;
    }

    /**
     * Gets the value of the firstSlideNum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getFirstSlideNum() {
        if (firstSlideNum == null) {
            return  1;
        } else {
            return firstSlideNum;
        }
    }

    /**
     * Sets the value of the firstSlideNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFirstSlideNum(Integer value) {
        this.firstSlideNum = value;
    }

    /**
     * Gets the value of the showSpecialPlsOnTitleSld property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isShowSpecialPlsOnTitleSld() {
        if (showSpecialPlsOnTitleSld == null) {
            return true;
        } else {
            return showSpecialPlsOnTitleSld;
        }
    }

    /**
     * Sets the value of the showSpecialPlsOnTitleSld property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowSpecialPlsOnTitleSld(Boolean value) {
        this.showSpecialPlsOnTitleSld = value;
    }

    /**
     * Gets the value of the rtl property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isRtl() {
        if (rtl == null) {
            return false;
        } else {
            return rtl;
        }
    }

    /**
     * Sets the value of the rtl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRtl(Boolean value) {
        this.rtl = value;
    }

    /**
     * Gets the value of the removePersonalInfoOnSave property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isRemovePersonalInfoOnSave() {
        if (removePersonalInfoOnSave == null) {
            return false;
        } else {
            return removePersonalInfoOnSave;
        }
    }

    /**
     * Sets the value of the removePersonalInfoOnSave property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRemovePersonalInfoOnSave(Boolean value) {
        this.removePersonalInfoOnSave = value;
    }

    /**
     * Gets the value of the compatMode property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isCompatMode() {
        if (compatMode == null) {
            return false;
        } else {
            return compatMode;
        }
    }

    /**
     * Sets the value of the compatMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCompatMode(Boolean value) {
        this.compatMode = value;
    }

    /**
     * Gets the value of the strictFirstAndLastChars property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isStrictFirstAndLastChars() {
        if (strictFirstAndLastChars == null) {
            return true;
        } else {
            return strictFirstAndLastChars;
        }
    }

    /**
     * Sets the value of the strictFirstAndLastChars property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStrictFirstAndLastChars(Boolean value) {
        this.strictFirstAndLastChars = value;
    }

    /**
     * Gets the value of the embedTrueTypeFonts property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isEmbedTrueTypeFonts() {
        if (embedTrueTypeFonts == null) {
            return false;
        } else {
            return embedTrueTypeFonts;
        }
    }

    /**
     * Sets the value of the embedTrueTypeFonts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEmbedTrueTypeFonts(Boolean value) {
        this.embedTrueTypeFonts = value;
    }

    /**
     * Gets the value of the saveSubsetFonts property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSaveSubsetFonts() {
        if (saveSubsetFonts == null) {
            return false;
        } else {
            return saveSubsetFonts;
        }
    }

    /**
     * Sets the value of the saveSubsetFonts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSaveSubsetFonts(Boolean value) {
        this.saveSubsetFonts = value;
    }

    /**
     * Gets the value of the autoCompressPictures property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isAutoCompressPictures() {
        if (autoCompressPictures == null) {
            return true;
        } else {
            return autoCompressPictures;
        }
    }

    /**
     * Sets the value of the autoCompressPictures property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoCompressPictures(Boolean value) {
        this.autoCompressPictures = value;
    }

    /**
     * Gets the value of the bookmarkIdSeed property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public long getBookmarkIdSeed() {
        if (bookmarkIdSeed == null) {
            return  1L;
        } else {
            return bookmarkIdSeed;
        }
    }

    /**
     * Sets the value of the bookmarkIdSeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBookmarkIdSeed(Long value) {
        this.bookmarkIdSeed = value;
    }

}