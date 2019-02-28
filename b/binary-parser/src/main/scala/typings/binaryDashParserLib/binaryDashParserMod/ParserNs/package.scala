package typings
package binaryDashParserLib.binaryDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ParserNs {
  type Data = scala.Double | java.lang.String | (js.Array[scala.Double | binaryDashParserLib.binaryDashParserMod.Parser[js.Any]]) | binaryDashParserLib.binaryDashParserMod.Parser[js.Any] | nodeLib.Buffer
  type Next[O /* <: js.UndefOr[js.Object] */, N /* <: java.lang.String */, T /* <: js.Any */] = binaryDashParserLib.binaryDashParserMod.Parser[
    Valid[
      O, 
      /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ name in N ]: T}
    */ binaryDashParserLib.binaryDashParserLibStrings.Next with js.Any
    ]
  ]
  type Parsed[O /* <: js.UndefOr[js.Object] */] = O | js.Object
  type Valid[O /* <: js.UndefOr[js.Object] */, P /* <: js.Object */] = (O with P) | P
}
