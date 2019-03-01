package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Central interface for rendering.
  *
  * This is the central interface for graphical output production, and the place where all draw methods are located.
  *
  * Some notes are in order to explain the concepts used here. The {@link XCanvas} interface is free of client-modifiable state, i.e. it can be used
  * safely and without external synchronization in a multi-threaded environment. On the other hand, this implies that for nearly every canvas operation,
  * external state is required. This is provided by {@link ViewState} and {@link RenderState} in a unified fashion, supplemented by a few extra state
  * parameters for some methods (e.g. textured polygons or text rendering).
  *
  * When used careless, this scheme can be inefficient to some extend, because internally, view, render and other states have to be combined before
  * rendering. This is especially expensive for complex clip polygons, i.e. when both {@link ViewState} and {@link RenderState} have a complex clip
  * polygon set, which have to be intersected before rendering. It is therefore recommended to combine {@link ViewState} and {@link RenderState} already
  * at the client side, when objects are organized in a hierarchical way: the classic example are grouped draw shapes, whose parent group object imposes a
  * common clipping and a common transformation on its siblings. The group object would therefore merge the {@link ViewState} and the {@link RenderState}
  * it is called with into a new {@link ViewState} , and call its siblings with a {@link RenderState} containing only the local offset (and no extra
  * clipping).
  *
  * Further on, this stateless nature provides easy ways for caching. Every non-trivial operation on {@link XCanvas} can return a cache object, which,
  * when called to redraw, renders the primitive usually much more quickly than the original method. Note that such caching is a lot more complicated,
  * should the actual rendering a method yields depend on internal state (which is the case e.g. for the {@link com.sun.star.awt.XGraphics} interface).
  * Please note, though, that deciding whether to return an {@link XCachedPrimitive} is completely up to the implementation - don't rely on the methods
  * returning something (this is because there might be cases when returning such a cache object will actually be a pessimization, since it involves
  * memory allocation and comparisons).
  *
  * Things that need more than a small, fixed amount of data are encapsulated in own interfaces, e.g. polygons and bitmaps. You can, in principle, roll
  * your own implementations of these interfaces, wrap it around your internal representation of polygons and bitmaps, and render them. It might just not
  * be overly fast, because the {@link XCanvas} would need to convert for each render call. It is therefore recommended to create such objects via the
  * {@link XGraphicDevice} factory (to be retrieved from every canvas object via the {@link getDevice()} call) - they will then internally optimize to the
  * underlying graphics subsystem.
  * @since OOo 2.0
  */
trait XCanvas
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Request the associated graphic device for this canvas.
    *
    * A graphic device provides methods specific to the underlying output device capabilities, which are common for all canvases rendering to such a device.
    * This includes device resolution, color space, or bitmap formats.
    * @returns the associated {@link XGraphicDevice} .
    */
  val Device: XGraphicDevice
  /**
    * Clear the whole canvas area.
    *
    * This method clears the whole canvas area to the device default color (e.g. white for a printer, transparent for an {@link XCustomSprite} ).
    */
  def clear(): scala.Unit
  /**
    * Create a suitable font for the specified font description.
    * @param aFontRequest
    * @param aExtraFontProperties Additional font properties to be applied when selecting this font. Normally, you should not need this parameter. Currently,
    * @param aFontMatrix Font-specific transformation matrix, which affects both the glyphs as well as the advancement.
    * @returns the requested font, or an invalid reference, if the request failed.
    * @throws com::sun::star::lang::IllegalArgumentException if one of the parameters is not within the allowed range.
    */
  def createFont(
    aFontRequest: FontRequest,
    aExtraFontProperties: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue],
    aFontMatrix: activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.Matrix2D
  ): XCanvasFont
  /**
    * Draw a cubic Bezier curve in device resolution width (i.e. one device pixel wide).
    * @param aBezierSegment The start and the two control points of the Bezier curve.
    * @param aEndPoint The end point of the Bezier curve.
    * @param aViewState The view state to be used when drawing this curve.
    * @param aRenderState The render state to be used when drawing this curve.
    * @throws com::sun::star::lang::IllegalArgumentException if one of the view and render state parameters are outside the specified range.
    */
  def drawBezier(
    aBezierSegment: activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.RealBezierSegment2D,
    aEndPoint: activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.RealPoint2D,
    aViewState: ViewState,
    aRenderState: RenderState
  ): scala.Unit
  /**
    * Render the given bitmap.
    *
    * This method renders the bitmap, at a position and shape as specified by the combined view and render transformations. For fast render speed, the
    * bitmap should be created by the corresponding {@link XGraphicDevice} 's {@link XGraphicDevice.createCompatibleBitmap()} method.
    * @param xBitmap The bitmap to render.
    * @param aViewState The view state to be used when drawing this text.
    * @param aRenderState The render state to be used when drawing this text.
    * @returns a handle to the cached rendering output.
    * @throws com::sun::star::lang::IllegalArgumentException if one of the view and render state parameters are outside the specified range.
    * @throws VolatileContentDestroyedException if a texture bitmap was volatile, and the content was destroyed before the rendering could take place.
    */
  def drawBitmap(xBitmap: XBitmap, aViewState: ViewState, aRenderState: RenderState): XCachedPrimitive
  /**
    * Render the given bitmap, with a global color modulation.
    *
    * This method renders the bitmap, at a position and shape as specified by the combined view and render transformations. For fast render speed, the
    * bitmap should be created by the corresponding {@link XGraphicDevice} 's {@link XGraphicDevice.createCompatibleBitmap()} method. The bitmap's color
    * channel values are multiplied with the device color values as specified in the render state.
    * @param xBitmap The bitmap to render.
    * @param aViewState The view state to be used when drawing this text.
    * @param aRenderState The render state to be used when drawing this text. The device color entry in the render state is multiplied with every pixel color
    * @returns a handle to the cached rendering output.
    * @throws com::sun::star::lang::IllegalArgumentException if one of the view and render state parameters are outside the specified range.
    * @throws VolatileContentDestroyedException if a texture bitmap was volatile, and the content was destroyed before the rendering could take place.
    */
  def drawBitmapModulated(xBitmap: XBitmap, aViewState: ViewState, aRenderState: RenderState): XCachedPrimitive
  /**
    * Draw a line in device resolution width (i.e. one device pixel wide).
    * @param aStartPoint The start point of the line to draw.
    * @param aEndPoint The end point of the line to draw.
    * @param aViewState The view state to be used when drawing this line.
    * @param aRenderState The render state to be used when drawing this line.
    * @throws com::sun::star::lang::IllegalArgumentException if one of the view and render state parameters are outside the specified range.
    */
  def drawLine(
    aStartPoint: activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.RealPoint2D,
    aEndPoint: activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.RealPoint2D,
    aViewState: ViewState,
    aRenderState: RenderState
  ): scala.Unit
  /**
    * Draw a point in device resolution on the device.
    * @param aPoint The point to draw.
    * @param aViewState The view state to be used when drawing this point.
    * @param aRenderState The render state to be used when drawing this point.
    * @throws com::sun::star::lang::IllegalArgumentException if one of the view and render state parameters are outside the specified range.
    */
  def drawPoint(
    aPoint: activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.RealPoint2D,
    aViewState: ViewState,
    aRenderState: RenderState
  ): scala.Unit
  /**
    * Draw a poly-polygon in device resolution line width (i.e. the lines are one device pixel wide).
    * @param xPolyPolygon The poly-polygon to draw.
    * @param aViewState The view state to be used when drawing this polygon.
    * @param aRenderState The render state to be used when drawing this polygon.
    * @returns a handle to the cached rendering output.
    * @throws com::sun::star::lang::IllegalArgumentException if one of the view and render state parameters are outside the specified range.
    */
  def drawPolyPolygon(xPolyPolygon: XPolyPolygon2D, aViewState: ViewState, aRenderState: RenderState): XCachedPrimitive
  /**
    * Draw the text given by the substring of the specified string with the given font.
    *
    * The local origin of this output operation is either the left end of the text baseline, for textDirection equal LEFT_TO_RIGHT, or the right end of the
    * baseline, for textDirection equal to RIGHT_TO_LEFT, respectively.
    * @param aText The text to output.
    * @param xFont The font retrieved from this canvas to be used when drawing the text.
    * @param aViewState The view state to be used when drawing this text.
    * @param aRenderState The render state to be used when drawing this text.
    * @param nTextDirection A value from the {@link TextDirection} collection, denoting the main writing direction for this string. The main writing direction
    * @returns a handle to the cached rendering output.
    * @throws com::sun::star::lang::IllegalArgumentException if one of the view and render state parameters are outside the specified range.
    */
  def drawText(
    aText: StringContext,
    xFont: XCanvasFont,
    aViewState: ViewState,
    aRenderState: RenderState,
    nTextDirection: scala.Double
  ): XCachedPrimitive
  /**
    * Draw the formatted text given by the text layout.
    *
    * The glyphs as represented by the text layout are always output with the reference position being the leftmost edge of the layout object's baseline. If
    * the layout contains more than one baseline, the baseline of the first strong character in logical order is used here (strong in this context means
    * that the character can be unambiguously assigned to a Unicode script).
    * @param xLayoutetText An interface to the readily layouted text, obtained from a {@link XCanvasFont} created at this canvas. The text layout already carr
    * @param aViewState The view state to be used when drawing this text.
    * @param aRenderState The render state to be used when drawing this text.
    * @returns a handle to the cached rendering output.
    * @throws com::sun::star::lang::IllegalArgumentException if one of the view and render state parameters are outside the specified range.
    */
  def drawTextLayout(xLayoutetText: XTextLayout, aViewState: ViewState, aRenderState: RenderState): XCachedPrimitive
  /**
    * Fill the given poly-polygon.
    *
    * This method fills the given poly-polygon according to the {@link RenderState} 's color and the poly-polygon's fill rule.
    * @param xPolyPolygon The poly-polygon to render.
    * @param aViewState The view state to be used when filling this polygon.
    * @param aRenderState The render state to be used when filling this polygon.
    * @returns a handle to the cached rendering output.
    * @throws com::sun::star::lang::IllegalArgumentException if one of the view and render state parameters are outside the specified range.
    */
  def fillPolyPolygon(xPolyPolygon: XPolyPolygon2D, aViewState: ViewState, aRenderState: RenderState): XCachedPrimitive
  /**
    * Fill the given poly-polygon with a mapped texture.
    *
    * This method fills the given poly-polygon according to the {@link RenderState} 's color, the given textures and poly-polygon's fill rule. The texture
    * is mapped to the poly-polygon's interior via the given texture mapping.
    * @param xPolyPolygon The poly-polygon to render.
    * @param aViewState The view state to be used when filling this polygon.
    * @param aRenderState The render state to be used when filling this polygon.
    * @param xTextures A sequence of texture definitions, with which to fill the polygonal area.
    * @param xMapping A bilinear mapping function which defines the warping of the textures on the output area.
    * @returns a handle to the cached rendering output.
    * @throws com::sun::star::lang::IllegalArgumentException if one of the view and render state parameters are outside the specified range.
    * @throws VolatileContentDestroyedException if a texture bitmap was volatile, and the content was destroyed before the rendering could take place.
    */
  def fillTextureMappedPolyPolygon(
    xPolyPolygon: XPolyPolygon2D,
    aViewState: ViewState,
    aRenderState: RenderState,
    xTextures: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[Texture],
    xMapping: activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.XMapping2D
  ): XCachedPrimitive
  /**
    * Fill the given poly-polygon with a texture.
    *
    * This method fills the given poly-polygon according to the {@link RenderState} 's color, the given textures and poly-polygon's fill rule.
    * @param xPolyPolygon The poly-polygon to render.
    * @param aViewState The view state to be used when filling this polygon.
    * @param aRenderState The render state to be used when filling this polygon.
    * @param xTextures A sequence of texture definitions, with which to fill the polygonal area.
    * @returns a handle to the cached rendering output.
    * @throws com::sun::star::lang::IllegalArgumentException if one of the view and render state parameters are outside the specified range.
    * @throws VolatileContentDestroyedException if a texture bitmap was volatile, and the content was destroyed before the rendering could take place.
    */
  def fillTexturedPolyPolygon(
    xPolyPolygon: XPolyPolygon2D,
    aViewState: ViewState,
    aRenderState: RenderState,
    xTextures: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[Texture]
  ): XCachedPrimitive
  /**
    * Request the associated graphic device for this canvas.
    *
    * A graphic device provides methods specific to the underlying output device capabilities, which are common for all canvases rendering to such a device.
    * This includes device resolution, color space, or bitmap formats.
    * @returns the associated {@link XGraphicDevice} .
    */
  def getDevice(): XGraphicDevice
  /**
    * Query font information, specific to this canvas.
    * @param aFilter Filter parameter to reduce the list of returned fonts. Every member of {@link FontInfo} that is not the empty string or the "don't care"
    * @param aFontProperties This interface can provide additional font properties to filter the list of available fonts against.
    * @returns the list of fonts matching the filter set.
    * @throws com::sun::star::lang::IllegalArgumentException if one of the font properties are invalid or not recognized, or if one of the {@link FontInfo} mem
    */
  def queryAvailableFonts(
    aFilter: FontInfo,
    aFontProperties: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  ): activexDashInteropLib.SafeArray[FontInfo]
  /**
    * Query the polygonal representation of the stroke outlines, as it would be generated by the strokePolyPolygon methods.
    *
    * This method can be used to e.g. set a clipping which covers the same area as a stroke.
    * @param xPolyPolygon The poly-polygon to render.
    * @param aViewState The view state to be used when generating the outline.
    * @param aRenderState The render state to be used when generating the outline.
    * @param aStrokeAttributes Further attributes used to parameterize the stroking.
    * @returns a poly-polygon describing the outline of the stroked area.
    * @throws com::sun::star::lang::IllegalArgumentException if one of the view and render state parameters are outside the specified range.
    */
  def queryStrokeShapes(
    xPolyPolygon: XPolyPolygon2D,
    aViewState: ViewState,
    aRenderState: RenderState,
    aStrokeAttributes: StrokeAttributes
  ): XPolyPolygon2D
  /**
    * Stroke each polygon of the provided poly-polygon with the specified stroke attributes.
    *
    * This method considers the stroking of all polygons as an atomic operation in relation to the {@link RenderState} 's CompositeOperationy operation.
    * That means, overlapping strokes from distinct polygons will look exactly as overlapping segments of the same polygon, even with transparency.
    * @param xPolyPolygon The poly-polygon to render.
    * @param aViewState The view state to be used when stroking this polygon.
    * @param aRenderState The render state to be used when stroking this polygon.
    * @param aStrokeAttributes Further attributes used to parameterize the stroking.
    * @returns a handle to the cached rendering output.
    * @throws com::sun::star::lang::IllegalArgumentException if one of the view and render state parameters are outside the specified range.
    */
  def strokePolyPolygon(
    xPolyPolygon: XPolyPolygon2D,
    aViewState: ViewState,
    aRenderState: RenderState,
    aStrokeAttributes: StrokeAttributes
  ): XCachedPrimitive
  /**
    * Stroke each polygon of the provided poly-polygon with the specified stroke attributes, fill the stroked outline with the specified texture graphics,
    * map the texture to the outline via the specified texture mapping.
    *
    * This method considers the stroking of all polygons as an atomic operation in relation to the {@link RenderState} 's CompositeOp operation. That means,
    * overlapping strokes from distinct polygons will look exactly as overlapping segments of the same polygon, even with transparency.
    * @param xPolyPolygon The poly-polygon to render.
    * @param aViewState The view state to be used when stroking this polygon.
    * @param aRenderState The render state to be used when stroking this polygon.
    * @param aTextures A sequence of texture definitions, with which to fill the stroked area.
    * @param xMapping A bilinear mapping function which defines the warping of the textures on the output area.
    * @param aStrokeAttributes Further attributes used to parameterize the stroking.
    * @returns a handle to the cached rendering output.
    * @throws com::sun::star::lang::IllegalArgumentException if one of the view and render state parameters are outside the specified range.
    * @throws VolatileContentDestroyedException if a texture bitmap was volatile, and the content was destroyed before the rendering could take place.
    */
  def strokeTextureMappedPolyPolygon(
    xPolyPolygon: XPolyPolygon2D,
    aViewState: ViewState,
    aRenderState: RenderState,
    aTextures: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[Texture],
    xMapping: activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.XMapping2D,
    aStrokeAttributes: StrokeAttributes
  ): XCachedPrimitive
  /**
    * Stroke each polygon of the provided poly-polygon with the specified stroke attributes, fill the stroked outline with the specified texture graphics.
    *
    * This method considers the stroking of all polygons as an atomic operation in relation to the {@link RenderState} 's CompositeOp operation. That means,
    * overlapping strokes from distinct polygons will look exactly as overlapping segments of the same polygon, even with transparency.
    * @param xPolyPolygon The poly-polygon to render.
    * @param aViewState The view state to be used when strokes this polygon.
    * @param aRenderState The render state to be used when stroking this polygon.
    * @param aTextures A sequence of texture definitions, with which to fill the stroked area.
    * @param aStrokeAttributes Further attributes used to parameterize the stroking.
    * @returns a handle to the cached rendering output.
    * @throws com::sun::star::lang::IllegalArgumentException if one of the view and render state parameters are outside the specified range.
    * @throws VolatileContentDestroyedException if a texture bitmap was volatile, and the content was destroyed before the rendering could take place.
    */
  def strokeTexturedPolyPolygon(
    xPolyPolygon: XPolyPolygon2D,
    aViewState: ViewState,
    aRenderState: RenderState,
    aTextures: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[Texture],
    aStrokeAttributes: StrokeAttributes
  ): XCachedPrimitive
}

object XCanvas {
  @scala.inline
  def apply(
    Device: XGraphicDevice,
    acquire: js.Function0[scala.Unit],
    clear: js.Function0[scala.Unit],
    createFont: js.Function3[
      FontRequest, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], 
      activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.Matrix2D, 
      XCanvasFont
    ],
    drawBezier: js.Function4[
      activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.RealBezierSegment2D, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.RealPoint2D, 
      ViewState, 
      RenderState, 
      scala.Unit
    ],
    drawBitmap: js.Function3[XBitmap, ViewState, RenderState, XCachedPrimitive],
    drawBitmapModulated: js.Function3[XBitmap, ViewState, RenderState, XCachedPrimitive],
    drawLine: js.Function4[
      activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.RealPoint2D, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.RealPoint2D, 
      ViewState, 
      RenderState, 
      scala.Unit
    ],
    drawPoint: js.Function3[
      activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.RealPoint2D, 
      ViewState, 
      RenderState, 
      scala.Unit
    ],
    drawPolyPolygon: js.Function3[XPolyPolygon2D, ViewState, RenderState, XCachedPrimitive],
    drawText: js.Function5[StringContext, XCanvasFont, ViewState, RenderState, scala.Double, XCachedPrimitive],
    drawTextLayout: js.Function3[XTextLayout, ViewState, RenderState, XCachedPrimitive],
    fillPolyPolygon: js.Function3[XPolyPolygon2D, ViewState, RenderState, XCachedPrimitive],
    fillTextureMappedPolyPolygon: js.Function5[
      XPolyPolygon2D, 
      ViewState, 
      RenderState, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[Texture], 
      activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.XMapping2D, 
      XCachedPrimitive
    ],
    fillTexturedPolyPolygon: js.Function4[
      XPolyPolygon2D, 
      ViewState, 
      RenderState, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[Texture], 
      XCachedPrimitive
    ],
    getDevice: js.Function0[XGraphicDevice],
    queryAvailableFonts: js.Function2[
      FontInfo, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], 
      activexDashInteropLib.SafeArray[FontInfo]
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    queryStrokeShapes: js.Function4[XPolyPolygon2D, ViewState, RenderState, StrokeAttributes, XPolyPolygon2D],
    release: js.Function0[scala.Unit],
    strokePolyPolygon: js.Function4[XPolyPolygon2D, ViewState, RenderState, StrokeAttributes, XCachedPrimitive],
    strokeTextureMappedPolyPolygon: js.Function6[
      XPolyPolygon2D, 
      ViewState, 
      RenderState, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[Texture], 
      activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.XMapping2D, 
      StrokeAttributes, 
      XCachedPrimitive
    ],
    strokeTexturedPolyPolygon: js.Function5[
      XPolyPolygon2D, 
      ViewState, 
      RenderState, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[Texture], 
      StrokeAttributes, 
      XCachedPrimitive
    ]
  ): XCanvas = {
    val __obj = js.Dynamic.literal(Device = Device, acquire = acquire, clear = clear, createFont = createFont, drawBezier = drawBezier, drawBitmap = drawBitmap, drawBitmapModulated = drawBitmapModulated, drawLine = drawLine, drawPoint = drawPoint, drawPolyPolygon = drawPolyPolygon, drawText = drawText, drawTextLayout = drawTextLayout, fillPolyPolygon = fillPolyPolygon, fillTextureMappedPolyPolygon = fillTextureMappedPolyPolygon, fillTexturedPolyPolygon = fillTexturedPolyPolygon, getDevice = getDevice, queryAvailableFonts = queryAvailableFonts, queryInterface = queryInterface, queryStrokeShapes = queryStrokeShapes, release = release, strokePolyPolygon = strokePolyPolygon, strokeTextureMappedPolyPolygon = strokeTextureMappedPolyPolygon, strokeTexturedPolyPolygon = strokeTexturedPolyPolygon)
  
    __obj.asInstanceOf[XCanvas]
  }
}

