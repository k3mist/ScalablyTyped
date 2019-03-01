package typings
package atPulumiAwsLib.glueGetScriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetScriptArgs extends js.Object {
  /**
    * A list of the edges in the DAG. Defined below.
    */
  val dagEdges: js.Array[atPulumiAwsLib.Anon_Source]
  /**
    * A list of the nodes in the DAG. Defined below.
    */
  val dagNodes: js.Array[atPulumiAwsLib.Anon_ArgsId]
  /**
    * The programming language of the resulting code from the DAG. Defaults to `PYTHON`. Valid values are `PYTHON` and `SCALA`.
    */
  val language: js.UndefOr[java.lang.String] = js.undefined
}

object GetScriptArgs {
  @scala.inline
  def apply(
    dagEdges: js.Array[atPulumiAwsLib.Anon_Source],
    dagNodes: js.Array[atPulumiAwsLib.Anon_ArgsId],
    language: java.lang.String = null
  ): GetScriptArgs = {
    val __obj = js.Dynamic.literal(dagEdges = dagEdges, dagNodes = dagNodes)
    if (language != null) __obj.updateDynamic("language")(language)
    __obj.asInstanceOf[GetScriptArgs]
  }
}

