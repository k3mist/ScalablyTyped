package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The {@link XAccessibleComponent} interface should be supported by any class that can be rendered on the screen.
  *
  * This interface provides the standard mechanism for an assistive technology to retrieve information concerning the graphical representation of an
  * object. This interface combines methods from the Java interfaces `javax.accessibility.AccessibleComponent` and
  * `javax.accessibility.AccessibleExtendedComponent` .
  *
  * Further information about the graphical appearance of an object can be expressed with the {@link XAccessibleExtendedComponent} interface.
  *
  * Coordinates used by the functions of this interface are specified in different coordinate systems. Their scale is the same and is equal to that of the
  * screen coordinate system. In other words all coordinates are measured in pixel. They differ in their respective origin: The screen coordinate system
  * has its origin in the upper left corner of the current screen. Used by the {@link getLocationOnScreen()} function.The origin of the parent coordinate
  * system is the upper left corner of the parent's bounding box. With no parent the screen coordinate system is used instead. Used by the {@link
  * getLocation()} function.The object coordinate system is relative to the upper left corner of an object's bounding box. It is relative to itself so to
  * speak. Used by the {@link containsPoint()} and {@link getAccessibleAtPoint()} functions.
  *
  * Key bindings which are associated with an accessible component can be retrieved at the component's action. The reason for this is that key bindings
  * are associated with actions and directly with a component. This distinction becomes important when there are more than one action. To get access to
  * the key bindings you have to get the {@link XAccessibleAction} interface of a component, provided that it is supported, and use the
  * XAccessibleAction::getAccessibleKeyBinding().
  * @see XAccessibleExtendedComponent
  * @since OOo 1.1.2
  */
trait XAccessibleComponent
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Returns the background color of this object.
    * @returns The returned color is the background color of this object or, if that is not supported, the default background color.
    */
  val Background: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  /**
    * Returns the bounding box of this object.
    *
    * The returned bounding box has the form of a rectangle. Its coordinates are relative to the object's parent coordinate system. Note that the two
    * methods {@link getLocation()} and {@link getSize()} return the same information. With method {@link getLocationOnScreen()} you can get the bound box
    * position in screen coordinates.
    * @returns The coordinates of the returned rectangle are relative to this object's parent or relative to the screen on which this object is rendered if it h
    */
  val Bounds: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle
  /**
    * Returns the foreground color of this object.
    * @returns The returned color is the foreground color of this object or, if that is not supported, the default foreground color.
    */
  val Foreground: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  /**
    * Returns the location of the upper left corner of the object's bounding box relative to the parent.
    *
    * The coordinates of the bounding box are given relative to the parent's coordinate system.
    * @returns The coordinates of the returned position are relative to this object's parent or relative to the screen on which this object is rendered if it ha
    */
  val Location: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point
  /**
    * Returns the location of the upper left corner of the object's bounding box in screen coordinates.
    *
    * This method returns the same point as does the method {@link getLocation()} . The difference is that the coordinates are absolute screen coordinates
    * of the screen to which the object is rendered instead of being relative to the object's parent.
    * @returns The coordinates of the returned position are relative to the screen on which this object is rendered. If the object is not on any screen the retu
    */
  val LocationOnScreen: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point
  /**
    * Returns the size of this object's bounding box.
    * @returns The returned size is the size of this object or empty if it is not rendered on any screen.
    */
  val Size: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size
  /**
    * Tests whether the specified point lies within this object's bounds.
    *
    * The test point's coordinates are defined relative to the coordinate system of the object. That means that when the object is an opaque rectangle then
    * both the points (0,0) and (with-1,height-1) would yield a `TRUE` value.
    * @param Point Coordinates of the point to test. The origin of the coordinate system is the upper left corner of the object's bounding box as returned by
    * @returns Returns `TRUE` if the point lies within or on the object's bounding box and `FALSE` otherwise.
    */
  def containsPoint(Point: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point): scala.Boolean
  /**
    * Returns the {@link Accessible} child that is rendered under the given point.
    *
    * The test point's coordinates are defined relative to the coordinate system of the object. That means that when the object is an opaque rectangle then
    * both the points (0,0) and (with-1,height-1) would yield a `TRUE` value.
    * @param Point Coordinates of the test point for which to find the {@link Accessible} child. The origin of the coordinate system is the upper left corner
    * @returns If there is one child which is rendered so that its bounding box contains the test point then a reference to that object is returned. If there is
    */
  def getAccessibleAtPoint(Point: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point): XAccessible
  /**
    * Returns the background color of this object.
    * @returns The returned color is the background color of this object or, if that is not supported, the default background color.
    */
  def getBackground(): activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  /**
    * Returns the bounding box of this object.
    *
    * The returned bounding box has the form of a rectangle. Its coordinates are relative to the object's parent coordinate system. Note that the two
    * methods {@link getLocation()} and {@link getSize()} return the same information. With method {@link getLocationOnScreen()} you can get the bound box
    * position in screen coordinates.
    * @returns The coordinates of the returned rectangle are relative to this object's parent or relative to the screen on which this object is rendered if it h
    */
  def getBounds(): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle
  /**
    * Returns the foreground color of this object.
    * @returns The returned color is the foreground color of this object or, if that is not supported, the default foreground color.
    */
  def getForeground(): activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  /**
    * Returns the location of the upper left corner of the object's bounding box relative to the parent.
    *
    * The coordinates of the bounding box are given relative to the parent's coordinate system.
    * @returns The coordinates of the returned position are relative to this object's parent or relative to the screen on which this object is rendered if it ha
    */
  def getLocation(): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point
  /**
    * Returns the location of the upper left corner of the object's bounding box in screen coordinates.
    *
    * This method returns the same point as does the method {@link getLocation()} . The difference is that the coordinates are absolute screen coordinates
    * of the screen to which the object is rendered instead of being relative to the object's parent.
    * @returns The coordinates of the returned position are relative to the screen on which this object is rendered. If the object is not on any screen the retu
    */
  def getLocationOnScreen(): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point
  /**
    * Returns the size of this object's bounding box.
    * @returns The returned size is the size of this object or empty if it is not rendered on any screen.
    */
  def getSize(): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size
  /**
    * Grabs the focus to this object.
    *
    * If this object can not accept the focus, i.e. isFocusTraversable() returns `FALSE` for this object then nothing happens. Otherwise the object will
    * attempt to take the focus. Nothing happens if that fails, otherwise the object has the focus. This method is called `requestFocus` in the Java
    * Accessibility API 1.4.
    */
  def grabFocus(): scala.Unit
}

object XAccessibleComponent {
  @scala.inline
  def apply(
    Background: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    Bounds: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle,
    Foreground: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    Location: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point,
    LocationOnScreen: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point,
    Size: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size,
    acquire: js.Function0[scala.Unit],
    containsPoint: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point, scala.Boolean],
    getAccessibleAtPoint: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point, XAccessible],
    getBackground: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color],
    getBounds: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle],
    getForeground: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color],
    getLocation: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point],
    getLocationOnScreen: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point],
    getSize: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size],
    grabFocus: js.Function0[scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XAccessibleComponent = {
    val __obj = js.Dynamic.literal(Background = Background, Bounds = Bounds, Foreground = Foreground, Location = Location, LocationOnScreen = LocationOnScreen, Size = Size, acquire = acquire, containsPoint = containsPoint, getAccessibleAtPoint = getAccessibleAtPoint, getBackground = getBackground, getBounds = getBounds, getForeground = getForeground, getLocation = getLocation, getLocationOnScreen = getLocationOnScreen, getSize = getSize, grabFocus = grabFocus, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XAccessibleComponent]
  }
}

