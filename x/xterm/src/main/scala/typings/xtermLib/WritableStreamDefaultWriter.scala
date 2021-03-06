package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WritableStreamDefaultWriter[W] extends js.Object {
  val closed: js.Promise[scala.Unit] = js.native
  val desiredSize: scala.Double | scala.Null = js.native
  val ready: js.Promise[scala.Unit] = js.native
  def abort(): js.Promise[scala.Unit] = js.native
  def abort(reason: js.Any): js.Promise[scala.Unit] = js.native
  def close(): js.Promise[scala.Unit] = js.native
  def releaseLock(): scala.Unit = js.native
  def write(chunk: W): js.Promise[scala.Unit] = js.native
}

