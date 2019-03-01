package typings
package atVueComponentDashCompilerDashUtilsLib.distCompileTemplateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TemplateCompileResult extends js.Object {
  var code: java.lang.String
  var errors: js.Array[
    java.lang.String | atVueComponentDashCompilerDashUtilsLib.distTypesMod.ErrorWithRange
  ]
  var source: java.lang.String
  var tips: js.Array[
    java.lang.String | atVueComponentDashCompilerDashUtilsLib.distTypesMod.ErrorWithRange
  ]
}

object TemplateCompileResult {
  @scala.inline
  def apply(
    code: java.lang.String,
    errors: js.Array[
      java.lang.String | atVueComponentDashCompilerDashUtilsLib.distTypesMod.ErrorWithRange
    ],
    source: java.lang.String,
    tips: js.Array[
      java.lang.String | atVueComponentDashCompilerDashUtilsLib.distTypesMod.ErrorWithRange
    ]
  ): TemplateCompileResult = {
    val __obj = js.Dynamic.literal(code = code, errors = errors, source = source, tips = tips)
  
    __obj.asInstanceOf[TemplateCompileResult]
  }
}

