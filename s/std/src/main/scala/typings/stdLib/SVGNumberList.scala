package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGNumberList
  extends /* index */ org.scalablytyped.runtime.NumberDictionary[SVGNumber] {
  @JSName(org.scalablytyped.runtime.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[SVGNumber]]
  val length: scala.Double
  val numberOfItems: scala.Double
  def appendItem(newItem: SVGNumber): SVGNumber
  def clear(): scala.Unit
  def getItem(index: scala.Double): SVGNumber
  def initialize(newItem: SVGNumber): SVGNumber
  def insertItemBefore(newItem: SVGNumber, index: scala.Double): SVGNumber
  def removeItem(index: scala.Double): SVGNumber
  def replaceItem(newItem: SVGNumber, index: scala.Double): SVGNumber
}

@JSGlobal("SVGNumberList")
@js.native
object SVGNumberList
  extends org.scalablytyped.runtime.Instantiable0[SVGNumberList]

