package typings
package jsgraphLib.jsgraphMod.jsgraphNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Visitor extends js.Object {
  def blackTarget(req: jsgraphLib.Anon_E): scala.Unit
  def discoverVertex(req: jsgraphLib.Anon_G): scala.Unit
  def examineEdge(req: jsgraphLib.Anon_E): scala.Unit
  def examineVertex(req: jsgraphLib.Anon_G): scala.Unit
  def finishVertex(req: jsgraphLib.Anon_G): scala.Unit
  def grayTarget(req: jsgraphLib.Anon_E): scala.Unit
  def initializeVertex(req: jsgraphLib.Anon_G): scala.Unit
  def nonTreeEdge(req: jsgraphLib.Anon_E): scala.Unit
  def startVertex(req: jsgraphLib.Anon_G): scala.Unit
}

object Visitor {
  @scala.inline
  def apply(
    blackTarget: js.Function1[jsgraphLib.Anon_E, scala.Unit],
    discoverVertex: js.Function1[jsgraphLib.Anon_G, scala.Unit],
    examineEdge: js.Function1[jsgraphLib.Anon_E, scala.Unit],
    examineVertex: js.Function1[jsgraphLib.Anon_G, scala.Unit],
    finishVertex: js.Function1[jsgraphLib.Anon_G, scala.Unit],
    grayTarget: js.Function1[jsgraphLib.Anon_E, scala.Unit],
    initializeVertex: js.Function1[jsgraphLib.Anon_G, scala.Unit],
    nonTreeEdge: js.Function1[jsgraphLib.Anon_E, scala.Unit],
    startVertex: js.Function1[jsgraphLib.Anon_G, scala.Unit]
  ): Visitor = {
    val __obj = js.Dynamic.literal(blackTarget = blackTarget, discoverVertex = discoverVertex, examineEdge = examineEdge, examineVertex = examineVertex, finishVertex = finishVertex, grayTarget = grayTarget, initializeVertex = initializeVertex, nonTreeEdge = nonTreeEdge, startVertex = startVertex)
  
    __obj.asInstanceOf[Visitor]
  }
}

