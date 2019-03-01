package typings
package atIonicCliDashFrameworkLib.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NamespaceLocateResult[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] extends js.Object {
  val args: js.Array[java.lang.String]
  val obj: C | N
  val path: js.Array[CommandPathItem[C, N, M, I, O]]
}

object NamespaceLocateResult {
  @scala.inline
  def apply[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */](args: js.Array[java.lang.String], obj: C | N, path: js.Array[CommandPathItem[C, N, M, I, O]]): NamespaceLocateResult[C, N, M, I, O] = {
    val __obj = js.Dynamic.literal(args = args, obj = obj.asInstanceOf[js.Any], path = path)
  
    __obj.asInstanceOf[NamespaceLocateResult[C, N, M, I, O]]
  }
}

