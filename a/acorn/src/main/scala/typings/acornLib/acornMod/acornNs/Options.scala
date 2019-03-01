package typings
package acornLib.acornMod.acornNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var allowHashBang: js.UndefOr[scala.Boolean] = js.undefined
  var allowImportExportEverywhere: js.UndefOr[scala.Boolean] = js.undefined
  var allowReserved: js.UndefOr[scala.Boolean] = js.undefined
  var allowReturnOutsideFunction: js.UndefOr[scala.Boolean] = js.undefined
  var directSourceFile: js.UndefOr[java.lang.String] = js.undefined
  var ecmaVersion: js.UndefOr[
    acornLib.acornLibNumbers.`3` | acornLib.acornLibNumbers.`5` | acornLib.acornLibNumbers.`6` | acornLib.acornLibNumbers.`7` | acornLib.acornLibNumbers.`8` | acornLib.acornLibNumbers.`2015` | acornLib.acornLibNumbers.`2016` | acornLib.acornLibNumbers.`2017`
  ] = js.undefined
  var locations: js.UndefOr[scala.Boolean] = js.undefined
  var onComment: js.UndefOr[
    (js.Function6[
      /* isBlock */ scala.Boolean, 
      /* text */ java.lang.String, 
      /* start */ scala.Double, 
      /* end */ scala.Double, 
      /* startLoc */ js.UndefOr[estreeLib.estreeMod.Position], 
      /* endLoc */ js.UndefOr[estreeLib.estreeMod.Position], 
      scala.Unit
    ]) | js.Array[Comment]
  ] = js.undefined
  var onInsertedSemicolon: js.UndefOr[
    js.Function2[
      /* lastTokEnd */ scala.Double, 
      /* lastTokEndLoc */ js.UndefOr[estreeLib.estreeMod.Position], 
      scala.Unit
    ]
  ] = js.undefined
  var onToken: js.UndefOr[(js.Function1[/* token */ Token, _]) | js.Array[Token]] = js.undefined
  var onTrailingComma: js.UndefOr[
    js.Function2[
      /* lastTokEnd */ scala.Double, 
      /* lastTokEndLoc */ js.UndefOr[estreeLib.estreeMod.Position], 
      scala.Unit
    ]
  ] = js.undefined
  var plugins: js.UndefOr[PlainObject] = js.undefined
  var preserveParens: js.UndefOr[scala.Boolean] = js.undefined
  var program: js.UndefOr[estreeLib.estreeMod.Program] = js.undefined
  var ranges: js.UndefOr[scala.Boolean] = js.undefined
  var sourceFile: js.UndefOr[java.lang.String] = js.undefined
  var sourceType: js.UndefOr[acornLib.acornLibStrings.script | acornLib.acornLibStrings.module] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    allowHashBang: js.UndefOr[scala.Boolean] = js.undefined,
    allowImportExportEverywhere: js.UndefOr[scala.Boolean] = js.undefined,
    allowReserved: js.UndefOr[scala.Boolean] = js.undefined,
    allowReturnOutsideFunction: js.UndefOr[scala.Boolean] = js.undefined,
    directSourceFile: java.lang.String = null,
    ecmaVersion: acornLib.acornLibNumbers.`3` | acornLib.acornLibNumbers.`5` | acornLib.acornLibNumbers.`6` | acornLib.acornLibNumbers.`7` | acornLib.acornLibNumbers.`8` | acornLib.acornLibNumbers.`2015` | acornLib.acornLibNumbers.`2016` | acornLib.acornLibNumbers.`2017` = null,
    locations: js.UndefOr[scala.Boolean] = js.undefined,
    onComment: (js.Function6[
      /* isBlock */ scala.Boolean, 
      /* text */ java.lang.String, 
      /* start */ scala.Double, 
      /* end */ scala.Double, 
      /* startLoc */ js.UndefOr[estreeLib.estreeMod.Position], 
      /* endLoc */ js.UndefOr[estreeLib.estreeMod.Position], 
      scala.Unit
    ]) | js.Array[Comment] = null,
    onInsertedSemicolon: js.Function2[
      /* lastTokEnd */ scala.Double, 
      /* lastTokEndLoc */ js.UndefOr[estreeLib.estreeMod.Position], 
      scala.Unit
    ] = null,
    onToken: (js.Function1[/* token */ Token, _]) | js.Array[Token] = null,
    onTrailingComma: js.Function2[
      /* lastTokEnd */ scala.Double, 
      /* lastTokEndLoc */ js.UndefOr[estreeLib.estreeMod.Position], 
      scala.Unit
    ] = null,
    plugins: PlainObject = null,
    preserveParens: js.UndefOr[scala.Boolean] = js.undefined,
    program: estreeLib.estreeMod.Program = null,
    ranges: js.UndefOr[scala.Boolean] = js.undefined,
    sourceFile: java.lang.String = null,
    sourceType: acornLib.acornLibStrings.script | acornLib.acornLibStrings.module = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowHashBang)) __obj.updateDynamic("allowHashBang")(allowHashBang)
    if (!js.isUndefined(allowImportExportEverywhere)) __obj.updateDynamic("allowImportExportEverywhere")(allowImportExportEverywhere)
    if (!js.isUndefined(allowReserved)) __obj.updateDynamic("allowReserved")(allowReserved)
    if (!js.isUndefined(allowReturnOutsideFunction)) __obj.updateDynamic("allowReturnOutsideFunction")(allowReturnOutsideFunction)
    if (directSourceFile != null) __obj.updateDynamic("directSourceFile")(directSourceFile)
    if (ecmaVersion != null) __obj.updateDynamic("ecmaVersion")(ecmaVersion.asInstanceOf[js.Any])
    if (!js.isUndefined(locations)) __obj.updateDynamic("locations")(locations)
    if (onComment != null) __obj.updateDynamic("onComment")(onComment.asInstanceOf[js.Any])
    if (onInsertedSemicolon != null) __obj.updateDynamic("onInsertedSemicolon")(onInsertedSemicolon)
    if (onToken != null) __obj.updateDynamic("onToken")(onToken.asInstanceOf[js.Any])
    if (onTrailingComma != null) __obj.updateDynamic("onTrailingComma")(onTrailingComma)
    if (plugins != null) __obj.updateDynamic("plugins")(plugins)
    if (!js.isUndefined(preserveParens)) __obj.updateDynamic("preserveParens")(preserveParens)
    if (program != null) __obj.updateDynamic("program")(program)
    if (!js.isUndefined(ranges)) __obj.updateDynamic("ranges")(ranges)
    if (sourceFile != null) __obj.updateDynamic("sourceFile")(sourceFile)
    if (sourceType != null) __obj.updateDynamic("sourceType")(sourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

