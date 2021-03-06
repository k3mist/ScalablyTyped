package typings
package remarkableLib.libMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object RemarkableNs {
  /**
    * Return `true` if the parsing function has recognized the current position
    * in the input as one if its tokens.
    */
  type BlockParsingRule = js.Function4[
    /* state */ StateBlock, 
    /* startLine */ scala.Double, 
    /* endLine */ scala.Double, 
    /* silent */ scala.Boolean, 
    scala.Boolean
  ]
  /**
    * Return `true` if the parsing function has recognized the current position
    * in the input as one if its tokens.
    */
  type CoreParsingRule = js.Function1[/* state */ StateInline, scala.Boolean]
  type GetBreak = js.Function2[
    /* tokens */ js.Array[ContentToken], 
    /* idx */ scala.Double, 
    remarkableLib.remarkableLibStrings.Empty | remarkableLib.remarkableLibStrings.BACKSLASHn
  ]
  /**
    * Return `true` if the parsing function has recognized the current position
    * in the input as one if its tokens.
    */
  type InlineParsingRule = js.Function2[/* state */ StateInline, /* silent */ scala.Boolean, scala.Boolean]
  type Plugin = js.Function2[
    /* md */ remarkableLib.libMod.Remarkable, 
    /* options */ js.UndefOr[js.Any], 
    scala.Unit
  ]
  type Rule = js.Function4[
    /* tokens */ js.Array[ContentToken], 
    /* idx */ scala.Double, 
    /* options */ Options, 
    /* env */ Env, 
    java.lang.String
  ]
  type Token = (BlockContentToken | ContentToken | TagToken) with MiscTokenProps
}
