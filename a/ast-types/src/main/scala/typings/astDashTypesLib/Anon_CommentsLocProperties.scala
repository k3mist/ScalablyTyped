package typings
package astDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CommentsLocProperties extends js.Object {
  var comments: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.CommentKind] | scala.Null] = js.undefined
  var loc: js.UndefOr[astDashTypesLib.genKindsMod.SourceLocationKind | scala.Null] = js.undefined
  var properties: js.Array[
    astDashTypesLib.genKindsMod.PropertyKind | astDashTypesLib.genKindsMod.ObjectMethodKind | astDashTypesLib.genKindsMod.ObjectPropertyKind | astDashTypesLib.genKindsMod.SpreadPropertyKind | astDashTypesLib.genKindsMod.SpreadElementKind
  ]
}

object Anon_CommentsLocProperties {
  @scala.inline
  def apply(
    properties: js.Array[
      astDashTypesLib.genKindsMod.PropertyKind | astDashTypesLib.genKindsMod.ObjectMethodKind | astDashTypesLib.genKindsMod.ObjectPropertyKind | astDashTypesLib.genKindsMod.SpreadPropertyKind | astDashTypesLib.genKindsMod.SpreadElementKind
    ],
    comments: js.Array[astDashTypesLib.genKindsMod.CommentKind] = null,
    loc: astDashTypesLib.genKindsMod.SourceLocationKind = null
  ): Anon_CommentsLocProperties = {
    val __obj = js.Dynamic.literal(properties = properties)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[Anon_CommentsLocProperties]
  }
}

