package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies a rectangular shape which contains a {@link Text} object and is attached to a piece of surrounding {@link Text} .
  * @see Text  This example shows how to create a {@link TextFrame} and insert it at the very beginning of {@link Text} component. The macro is ready to r
  */
trait TextFrame
  extends BaseFrame
     with XTextFrame {
  /** determines if the text frame should be editable in a read-only document. (This is usually used in forms.) */
  var EditInReadonly: scala.Boolean
  /** contains the metric height value of the frame. */
  var FrameHeightAbsolute: scala.Double
  /**
    * specifies a width relative to the width of the surrounding text.
    *
    * If the value for "HeightPercent" is 0, the absolute value from is used.
    */
  var FrameHeightPercent: scala.Double
  /** If "AutomaticHeight" is set, then the object grows if it is required by the frame content. */
  var FrameIsAutomaticHeight: scala.Boolean
  /** contains the metric width value of the frame. */
  var FrameWidthAbsolute: scala.Double
  /**
    * specifies a width relative to the width of the surrounding text.
    *
    * If the value for "WidthPercent" is 0, the absolute value from is used.
    */
  var FrameWidthPercent: scala.Double
  /**
    * controls, if the frame follows the text flow or can leave its layout environment
    *
    * If set, the frame follows the text flow and doesn't leaves the layout environment, which is given by its anchor, above and below. E.g.: Anchor resides
    * in the document body then the frame doesn't leave the document body above and below and follows the text flow through the document bodies of the
    * different pages.
    *
    * If not set, the frame doesn't follow the text flow and stays on the page, on which its anchor is found, but it may leave the layout environment, which
    * is given by its anchor. E.g.: Anchor resides in the document body then the frame stays on page, where this document body is, but it could leave the
    * document body above and below, e.g. overlapping with the page header.
    *
    * Note: The areas for the vertical orientation relation at page areas are interpreted in dependence to this property (
    * @see BaseFrameProperties.VertOrientRelation). If property is set, the page area is interpreted as the layout environment, given by its anchor. E.g.: A
    */
  var IsFollowingTextFlow: scala.Boolean
  /**
    * determines the interpretation of the height and relative height properties.
    * @@see SizeType
    */
  var SizeType: scala.Double
  /**
    * adjusts the vertical position of the text inside of the frame.
    * @see com.sun.star.drawing.TextVerticalAdjust
    * @since LibreOffice 4.3
    */
  var TextVerticalAdjust: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.TextVerticalAdjust
  /**
    * determines the interpretation of the width and relative width properties.
    * @see SizeType
    * @since OOo 2.4
    */
  var WidthType: scala.Double
  /** contains the writing direction, as represented by the {@link com.sun.star.text.WritingMode2} constants */
  var WritingMode: scala.Double
}

object TextFrame {
  @scala.inline
  def apply(
    Anchor: XTextRange,
    AnchorFrame: XTextFrame,
    AnchorPageNo: scala.Double,
    AnchorType: TextContentAnchorType,
    AnchorTypes: activexDashInteropLib.SafeArray[TextContentAnchorType],
    BackColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    BackGraphicFilter: java.lang.String,
    BackGraphicLocation: activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.GraphicLocation,
    BackGraphicURL: java.lang.String,
    BackTransparent: scala.Boolean,
    BorderDistance: scala.Double,
    BottomBorder: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.BorderLine,
    BottomBorderDistance: scala.Double,
    BottomMargin: scala.Double,
    ContentProtected: scala.Boolean,
    Description: java.lang.String,
    EditInReadonly: scala.Boolean,
    FillGradient: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Gradient,
    FillGradientName: java.lang.String,
    FillStyle: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.FillStyle,
    FrameHeightAbsolute: scala.Double,
    FrameHeightPercent: scala.Double,
    FrameInteropGrabBag: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue],
    FrameIsAutomaticHeight: scala.Boolean,
    FrameStyleName: java.lang.String,
    FrameWidthAbsolute: scala.Double,
    FrameWidthPercent: scala.Double,
    Height: scala.Double,
    HoriOrient: scala.Double,
    HoriOrientPosition: scala.Double,
    HoriOrientRelation: scala.Double,
    HyperLinkName: java.lang.String,
    HyperLinkTarget: java.lang.String,
    HyperLinkURL: java.lang.String,
    IsFollowingTextFlow: scala.Boolean,
    IsSyncHeightToWidth: scala.Boolean,
    IsSyncWidthToHeight: scala.Boolean,
    LayoutSize: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size,
    LeftBorder: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.BorderLine,
    LeftBorderDistance: scala.Double,
    LeftMargin: scala.Double,
    Name: java.lang.String,
    Opaque: scala.Boolean,
    PageToggle: scala.Boolean,
    Position: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point,
    PositionProtected: scala.Boolean,
    Print: scala.Boolean,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    RelativeHeight: scala.Double,
    RelativeHeightRelation: scala.Double,
    RelativeWidth: scala.Double,
    RelativeWidthRelation: scala.Double,
    RightBorder: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.BorderLine,
    RightBorderDistance: scala.Double,
    RightMargin: scala.Double,
    ServerMap: scala.Boolean,
    ShadowFormat: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.ShadowFormat,
    ShadowTransparence: scala.Double,
    ShapeType: java.lang.String,
    Size: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size,
    SizeProtected: scala.Boolean,
    SizeType: scala.Double,
    Surround: WrapTextMode,
    SurroundAnchorOnly: scala.Boolean,
    Text: XText,
    TextVerticalAdjust: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.TextVerticalAdjust,
    TextWrap: WrapTextMode,
    Title: java.lang.String,
    TopBorder: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.BorderLine,
    TopBorderDistance: scala.Double,
    TopMargin: scala.Double,
    UserDefinedAttributes: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer,
    VertOrient: scala.Double,
    VertOrientPosition: scala.Double,
    VertOrientRelation: scala.Double,
    Width: scala.Double,
    WidthType: scala.Double,
    WrapInfluenceOnPosition: scala.Double,
    WritingMode: scala.Double,
    acquire: js.Function0[scala.Unit],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    addPropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    addVetoableChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener, 
      scala.Unit
    ],
    attach: js.Function1[XTextRange, scala.Unit],
    dispose: js.Function0[scala.Unit],
    getAnchor: js.Function0[XTextRange],
    getName: js.Function0[java.lang.String],
    getPosition: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point],
    getPropertySetInfo: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo],
    getPropertyValue: js.Function1[java.lang.String, js.Any],
    getShapeType: js.Function0[java.lang.String],
    getSize: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size],
    getText: js.Function0[XText],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    removePropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    removeVetoableChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener, 
      scala.Unit
    ],
    setName: js.Function1[java.lang.String, scala.Unit],
    setPosition: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point, scala.Unit],
    setPropertyValue: js.Function2[java.lang.String, js.Any, scala.Unit],
    setSize: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size, scala.Unit]
  ): TextFrame = {
    val __obj = js.Dynamic.literal(Anchor = Anchor, AnchorFrame = AnchorFrame, AnchorPageNo = AnchorPageNo, AnchorType = AnchorType, AnchorTypes = AnchorTypes, BackColor = BackColor, BackGraphicFilter = BackGraphicFilter, BackGraphicLocation = BackGraphicLocation, BackGraphicURL = BackGraphicURL, BackTransparent = BackTransparent, BorderDistance = BorderDistance, BottomBorder = BottomBorder, BottomBorderDistance = BottomBorderDistance, BottomMargin = BottomMargin, ContentProtected = ContentProtected, Description = Description, EditInReadonly = EditInReadonly, FillGradient = FillGradient, FillGradientName = FillGradientName, FillStyle = FillStyle, FrameHeightAbsolute = FrameHeightAbsolute, FrameHeightPercent = FrameHeightPercent, FrameInteropGrabBag = FrameInteropGrabBag, FrameIsAutomaticHeight = FrameIsAutomaticHeight, FrameStyleName = FrameStyleName, FrameWidthAbsolute = FrameWidthAbsolute, FrameWidthPercent = FrameWidthPercent, Height = Height, HoriOrient = HoriOrient, HoriOrientPosition = HoriOrientPosition, HoriOrientRelation = HoriOrientRelation, HyperLinkName = HyperLinkName, HyperLinkTarget = HyperLinkTarget, HyperLinkURL = HyperLinkURL, IsFollowingTextFlow = IsFollowingTextFlow, IsSyncHeightToWidth = IsSyncHeightToWidth, IsSyncWidthToHeight = IsSyncWidthToHeight, LayoutSize = LayoutSize, LeftBorder = LeftBorder, LeftBorderDistance = LeftBorderDistance, LeftMargin = LeftMargin, Name = Name, Opaque = Opaque, PageToggle = PageToggle, Position = Position, PositionProtected = PositionProtected, Print = Print, PropertySetInfo = PropertySetInfo, RelativeHeight = RelativeHeight, RelativeHeightRelation = RelativeHeightRelation, RelativeWidth = RelativeWidth, RelativeWidthRelation = RelativeWidthRelation, RightBorder = RightBorder, RightBorderDistance = RightBorderDistance, RightMargin = RightMargin, ServerMap = ServerMap, ShadowFormat = ShadowFormat, ShadowTransparence = ShadowTransparence, ShapeType = ShapeType, Size = Size, SizeProtected = SizeProtected, SizeType = SizeType, Surround = Surround, SurroundAnchorOnly = SurroundAnchorOnly, Text = Text, TextVerticalAdjust = TextVerticalAdjust, TextWrap = TextWrap, Title = Title, TopBorder = TopBorder, TopBorderDistance = TopBorderDistance, TopMargin = TopMargin, UserDefinedAttributes = UserDefinedAttributes, VertOrient = VertOrient, VertOrientPosition = VertOrientPosition, VertOrientRelation = VertOrientRelation, Width = Width, WidthType = WidthType, WrapInfluenceOnPosition = WrapInfluenceOnPosition, WritingMode = WritingMode, acquire = acquire, addEventListener = addEventListener, addPropertyChangeListener = addPropertyChangeListener, addVetoableChangeListener = addVetoableChangeListener, attach = attach, dispose = dispose, getAnchor = getAnchor, getName = getName, getPosition = getPosition, getPropertySetInfo = getPropertySetInfo, getPropertyValue = getPropertyValue, getShapeType = getShapeType, getSize = getSize, getText = getText, queryInterface = queryInterface, release = release, removeEventListener = removeEventListener, removePropertyChangeListener = removePropertyChangeListener, removeVetoableChangeListener = removeVetoableChangeListener, setName = setName, setPosition = setPosition, setPropertyValue = setPropertyValue, setSize = setSize)
  
    __obj.asInstanceOf[TextFrame]
  }
}

