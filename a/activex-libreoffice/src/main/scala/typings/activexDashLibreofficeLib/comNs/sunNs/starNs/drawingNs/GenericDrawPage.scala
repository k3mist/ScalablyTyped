package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This abstract service is implemented by every page of a {@link DrawingDocument} .
  *
  * Example to create and insert a couple of LineShapes:
  *
  * {{program example here, see documentation}}
  */
trait GenericDrawPage
  extends XShapes
     with XShapeGrouper
     with XShapeCombiner
     with XShapeBinder
     with activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNamed
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet {
  /** This is the border at the bottom. */
  var BorderBottom: scala.Double
  /** This is the border at the left. */
  var BorderLeft: scala.Double
  /** This is the border at the right. */
  var BorderRight: scala.Double
  /** This is the border at the top. */
  var BorderTop: scala.Double
  /** This is the height. */
  var Height: scala.Double
  /**
    * this property is true if the averaged background filling colors luminance is belove an application specified threshold value. This can be used to
    * determine the actual value of an auto color.
    */
  var IsBackgroundDark: scala.Boolean
  /**
    * this index access defines a navigation order for the top level shapes inside this page. By default this is equal to the index access of the slide
    * itself, making the z-order the default navigation order for top level shapes.
    */
  var NavigationOrder: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess
  /** This is the number of this page, starting with 1. */
  var Number: scala.Double
  /** This is the orientation of this page. */
  var Orientation: activexDashLibreofficeLib.comNs.sunNs.starNs.viewNs.PaperOrientation
  /**
    * this property stores xml attributes. They will be saved to and restored from automatic styles inside xml files.
    * @see com.sun.star.xml.AttributeContainer
    */
  var UserDefinedAttributes: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer
  /** This is the width. */
  var Width: scala.Double
}

object GenericDrawPage {
  @scala.inline
  def apply(
    BorderBottom: scala.Double,
    BorderLeft: scala.Double,
    BorderRight: scala.Double,
    BorderTop: scala.Double,
    Count: scala.Double,
    ElementType: activexDashLibreofficeLib.`type`,
    Height: scala.Double,
    IsBackgroundDark: scala.Boolean,
    Name: java.lang.String,
    NavigationOrder: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess,
    Number: scala.Double,
    Orientation: activexDashLibreofficeLib.comNs.sunNs.starNs.viewNs.PaperOrientation,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    UserDefinedAttributes: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer,
    Width: scala.Double,
    acquire: js.Function0[scala.Unit],
    add: js.Function1[XShape, scala.Unit],
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
    bind: js.Function1[XShapes, XShape],
    combine: js.Function1[XShapes, XShape],
    getByIndex: js.Function1[scala.Double, js.Any],
    getCount: js.Function0[scala.Double],
    getElementType: js.Function0[activexDashLibreofficeLib.`type`],
    getName: js.Function0[java.lang.String],
    getPropertySetInfo: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo],
    getPropertyValue: js.Function1[java.lang.String, js.Any],
    group: js.Function1[XShapes, XShapeGroup],
    hasElements: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    remove: js.Function1[XShape, scala.Unit],
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
    setPropertyValue: js.Function2[java.lang.String, js.Any, scala.Unit],
    split: js.Function1[XShape, scala.Unit],
    unbind: js.Function1[XShape, scala.Unit],
    ungroup: js.Function1[XShapeGroup, scala.Unit]
  ): GenericDrawPage = {
    val __obj = js.Dynamic.literal(BorderBottom = BorderBottom, BorderLeft = BorderLeft, BorderRight = BorderRight, BorderTop = BorderTop, Count = Count, ElementType = ElementType, Height = Height, IsBackgroundDark = IsBackgroundDark, Name = Name, NavigationOrder = NavigationOrder, Number = Number, Orientation = Orientation, PropertySetInfo = PropertySetInfo, UserDefinedAttributes = UserDefinedAttributes, Width = Width, acquire = acquire, add = add, addPropertyChangeListener = addPropertyChangeListener, addVetoableChangeListener = addVetoableChangeListener, bind = bind, combine = combine, getByIndex = getByIndex, getCount = getCount, getElementType = getElementType, getName = getName, getPropertySetInfo = getPropertySetInfo, getPropertyValue = getPropertyValue, group = group, hasElements = hasElements, queryInterface = queryInterface, release = release, remove = remove, removePropertyChangeListener = removePropertyChangeListener, removeVetoableChangeListener = removeVetoableChangeListener, setName = setName, setPropertyValue = setPropertyValue, split = split, unbind = unbind, ungroup = ungroup)
  
    __obj.asInstanceOf[GenericDrawPage]
  }
}

