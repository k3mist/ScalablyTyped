package typings
package extjsLib.ExtNs.domNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Ext.dom.AbstractElement")
@js.native
class AbstractElement () extends js.Object

/* static members */
@JSGlobal("Ext.dom.AbstractElement")
@js.native
object AbstractElement extends js.Object {
  /** [Method] Add methods  properties to the prototype of this class
  		* @param members Object
  		*/
  def addMembers(): scala.Unit = js.native
  def addMembers(members: js.Any): scala.Unit = js.native
  /** [Method] Add  override static properties of this class
  		* @param members Object
  		* @returns Ext.Base this
  		*/
  def addStatics(): extjsLib.ExtNs.IBase = js.native
  def addStatics(members: js.Any): extjsLib.ExtNs.IBase = js.native
  /** [Method] Create a new instance of this Class
  		* @returns Object the created instance.
  		*/
  def create(): js.Any = js.native
  /** [Method] Create aliases for existing prototype methods
  		* @param alias String/Object The new method name, or an object to set multiple aliases. See flexSetter
  		* @param origin String/Object The original method name
  		*/
  def createAlias(): scala.Unit = js.native
  def createAlias(alias: js.Any): scala.Unit = js.native
  def createAlias(alias: js.Any, origin: js.Any): scala.Unit = js.native
  /** [Method] Gets the singleton flyweight element with the passed node as the active element
  		* @param dom String/HTMLElement The dom node or id
  		* @param named String Allows for creation of named reusable flyweights to prevent conflicts (e.g. internally Ext uses "_global")
  		* @returns Ext.dom.Element.Fly The singleton flyweight object (or null if no matching element was found)
  		*/
  def fly(): extjsLib.ExtNs.domNs.elementNs.IFly = js.native
  def fly(dom: js.Any): extjsLib.ExtNs.domNs.elementNs.IFly = js.native
  def fly(dom: js.Any, named: java.lang.String): extjsLib.ExtNs.domNs.elementNs.IFly = js.native
  /** [Method] Returns the top Element that is located at the passed coordinates Defined in override Ext dom AbstractElement_static
  		* @param x Number The x coordinate
  		* @param y Number The y coordinate
  		* @returns String The found Element
  		*/
  def fromPoint(): java.lang.String = js.native
  def fromPoint(x: scala.Double): java.lang.String = js.native
  def fromPoint(x: scala.Double, y: scala.Double): java.lang.String = js.native
  /** [Method] Retrieves Ext dom Element objects
  		* @param el String/HTMLElement/Ext.Element The id of the node, a DOM Node or an existing Element.
  		* @returns Ext.dom.Element The Element object (or null if no matching element was found)
  		*/
  def get(): extjsLib.ExtNs.domNs.IElement = js.native
  def get(el: js.Any): extjsLib.ExtNs.domNs.IElement = js.native
  /** [Method] Retrieves the document height Defined in override Ext dom AbstractElement_static
  		* @returns Number documentHeight
  		*/
  def getDocumentHeight(): scala.Double = js.native
  /** [Method] Retrieves the document width Defined in override Ext dom AbstractElement_static
  		* @returns Number documentWidth
  		*/
  def getDocumentWidth(): scala.Double = js.native
  /** [Method] Get the current class name in string format
  		* @returns String className
  		*/
  def getName(): java.lang.String = js.native
  /** [Method] Retrieves the current orientation of the window
  		* @returns String Orientation of window: 'portrait' or 'landscape'
  		*/
  def getOrientation(): java.lang.String = js.native
  /** [Method] Retrieves the viewport size of the window
  		* @returns Object object containing width and height properties
  		*/
  def getViewSize(): js.Any = js.native
  /** [Method] Retrieves the viewport height of the window
  		* @returns Number viewportHeight
  		*/
  def getViewportHeight(): scala.Double = js.native
  /** [Method] Retrieves the viewport width of the window
  		* @returns Number viewportWidth
  		*/
  def getViewportWidth(): scala.Double = js.native
  /** [Method] Adds members to class  */
  def implement(): scala.Unit = js.native
  /** [Method] Returns an array of unique class names based upon the input strings or string arrays
  		* @param clsList1 Mixed A string of class names, or an array of class names.
  		* @param clsList2 Mixed A string of class names, or an array of class names.
  		* @returns Array An array of strings representing remaining unique, merged class names. If class names were added to the first list, the changed property will be true.
  		*/
  def mergeClsList(): extjsLib.ExtNs.Array = js.native
  def mergeClsList(clsList1: js.Any): extjsLib.ExtNs.Array = js.native
  def mergeClsList(clsList1: js.Any, clsList2: js.Any): extjsLib.ExtNs.Array = js.native
  /** [Method] Normalizes CSS property keys from dash delimited to camel case JavaScript Syntax
  		* @param prop String The property to normalize
  		* @returns String The normalized string
  		*/
  def normalize(): java.lang.String = js.native
  def normalize(prop: java.lang.String): java.lang.String = js.native
  /** [Method] Override members of this class
  		* @param members Object The properties to add to this class. This should be specified as an object literal containing one or more properties.
  		* @returns Ext.Base this class
  		*/
  def `override`(): extjsLib.ExtNs.IBase = js.native
  def `override`(members: js.Any): extjsLib.ExtNs.IBase = js.native
  /** [Method] Parses a number or string representing margin sizes into an object
  		* @param box Number/String The encoded margins
  		* @returns Object An object with margin sizes for top, right, bottom and left
  		*/
  def parseBox(): js.Any = js.native
  def parseBox(box: js.Any): js.Any = js.native
  /** [Method] Converts a CSS string into an object with a property for each style
  		* @param styles String A CSS string
  		* @returns Object styles
  		*/
  def parseStyles(): js.Any = js.native
  def parseStyles(styles: java.lang.String): js.Any = js.native
  /** [Method] Returns an array of unique class names deom the first parameter with all class names from the second parameter removed
  		* @param existingClsList Mixed A string of class names, or an array of class names.
  		* @param removeClsList Mixed A string of class names, or an array of class names to remove from existingClsList.
  		* @returns Array An array of strings representing remaining class names. If class names were removed, the changed property will be true.
  		*/
  def removeCls(): extjsLib.ExtNs.Array = js.native
  def removeCls(existingClsList: js.Any): extjsLib.ExtNs.Array = js.native
  def removeCls(existingClsList: js.Any, removeClsList: js.Any): extjsLib.ExtNs.Array = js.native
  /** [Method] Parses a number or string representing margin sizes into an object
  		* @param box Number/String/Object The encoded margins, or an object with top, right, bottom, and left properties
  		* @param units String The type of units to add
  		* @returns String An string with unitized (px if units is not specified) metrics for top, right, bottom and left
  		*/
  def unitizeBox(): java.lang.String = js.native
  def unitizeBox(box: js.Any): java.lang.String = js.native
  def unitizeBox(box: js.Any, units: java.lang.String): java.lang.String = js.native
}

