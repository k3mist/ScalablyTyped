package typings
package pkijsLib.srcBasicConstraintsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pkijs/src/BasicConstraints", JSImport.Default)
@js.native
class default () extends BasicConstraints {
  def this(params: js.Any) = this()
  /* CompleteClass */
  override var cA: scala.Boolean = js.native
  /* CompleteClass */
  override var pathLenConstraint: scala.Double | asn1jsLib.asn1jsMod.Integer = js.native
  /* CompleteClass */
  override def fromSchema(schema: js.Any): scala.Unit = js.native
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
  /* CompleteClass */
  override def toSchema(): js.Any = js.native
}

/* static members */
@JSImport("pkijs/src/BasicConstraints", JSImport.Default)
@js.native
object default extends js.Object {
  def defaultValues(memberName: java.lang.String): js.Any = js.native
  def schema(): js.Any = js.native
  def schema(parameters: js.Any): js.Any = js.native
}

