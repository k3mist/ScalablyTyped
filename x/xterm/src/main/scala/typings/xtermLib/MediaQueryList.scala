package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaQueryList extends EventTarget {
  val matches: scala.Boolean = js.native
  val media: java.lang.String = js.native
  var onchange: (js.ThisFunction1[/* this */ this.type, /* ev */ MediaQueryListEvent, _]) | scala.Null = js.native
  @JSName("addEventListener")
  def addEventListener_change(
    `type`: xtermLib.xtermLibStrings.change,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaQueryListEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_change(
    `type`: xtermLib.xtermLibStrings.change,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaQueryListEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_change(
    `type`: xtermLib.xtermLibStrings.change,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaQueryListEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  /** @deprecated */
  def addListener(): scala.Unit = js.native
  /** @deprecated */
  def addListener(listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaQueryListEvent, _]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_change(
    `type`: xtermLib.xtermLibStrings.change,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaQueryListEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_change(
    `type`: xtermLib.xtermLibStrings.change,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaQueryListEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_change(
    `type`: xtermLib.xtermLibStrings.change,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaQueryListEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  /** @deprecated */
  def removeListener(): scala.Unit = js.native
  /** @deprecated */
  def removeListener(listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaQueryListEvent, _]): scala.Unit = js.native
}

@JSGlobal("MediaQueryList")
@js.native
object MediaQueryList
  extends ScalablyTyped.runtime.Instantiable0[MediaQueryList]
