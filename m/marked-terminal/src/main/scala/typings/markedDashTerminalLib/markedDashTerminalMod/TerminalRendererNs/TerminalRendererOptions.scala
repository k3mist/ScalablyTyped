package typings
package markedDashTerminalLib.markedDashTerminalMod.TerminalRendererNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TerminalRendererOptions extends js.Object {
  var blockquote: js.UndefOr[
    chalkLib.chalkMod.Chalk | (js.Function1[/* s */ java.lang.String, java.lang.String])
  ] = js.undefined
  var code: js.UndefOr[
    chalkLib.chalkMod.Chalk | (js.Function1[/* s */ java.lang.String, java.lang.String])
  ] = js.undefined
  var codespan: js.UndefOr[
    chalkLib.chalkMod.Chalk | (js.Function1[/* s */ java.lang.String, java.lang.String])
  ] = js.undefined
  var del: js.UndefOr[
    chalkLib.chalkMod.Chalk | (js.Function1[/* s */ java.lang.String, java.lang.String])
  ] = js.undefined
  var em: js.UndefOr[
    chalkLib.chalkMod.Chalk | (js.Function1[/* s */ java.lang.String, java.lang.String])
  ] = js.undefined
  // Whether or not to show emojis
  var emoji: js.UndefOr[scala.Boolean] = js.undefined
  var firstHeading: js.UndefOr[
    chalkLib.chalkMod.Chalk | (js.Function1[/* s */ java.lang.String, java.lang.String])
  ] = js.undefined
  var heading: js.UndefOr[
    chalkLib.chalkMod.Chalk | (js.Function1[/* s */ java.lang.String, java.lang.String])
  ] = js.undefined
  var hr: js.UndefOr[
    chalkLib.chalkMod.Chalk | (js.Function1[/* s */ java.lang.String, java.lang.String])
  ] = js.undefined
  var href: js.UndefOr[
    chalkLib.chalkMod.Chalk | (js.Function1[/* s */ java.lang.String, java.lang.String])
  ] = js.undefined
  var html: js.UndefOr[
    chalkLib.chalkMod.Chalk | (js.Function1[/* s */ java.lang.String, java.lang.String])
  ] = js.undefined
  var link: js.UndefOr[
    chalkLib.chalkMod.Chalk | (js.Function1[/* s */ java.lang.String, java.lang.String])
  ] = js.undefined
  // Formats the bulletpoints and numbers for lists
  var list: js.UndefOr[
    js.Function2[
      /* body */ java.lang.String, 
      /* ordered */ js.UndefOr[scala.Boolean], 
      java.lang.String
    ]
  ] = js.undefined
  var listitem: js.UndefOr[
    chalkLib.chalkMod.Chalk | (js.Function1[/* s */ java.lang.String, java.lang.String])
  ] = js.undefined
  var paragraph: js.UndefOr[
    chalkLib.chalkMod.Chalk | (js.Function1[/* s */ java.lang.String, java.lang.String])
  ] = js.undefined
   // only applicable when reflow is true
  var reflowText: js.UndefOr[scala.Boolean] = js.undefined
  // Should it prefix headers?
  var showSectionPrefix: js.UndefOr[scala.Boolean] = js.undefined
  var strong: js.UndefOr[
    chalkLib.chalkMod.Chalk | (js.Function1[/* s */ java.lang.String, java.lang.String])
  ] = js.undefined
  // The size of tabs in number of spaces or as tab characters
  var tab: js.UndefOr[scala.Double] = js.undefined
  var table: js.UndefOr[
    chalkLib.chalkMod.Chalk | (js.Function1[/* s */ java.lang.String, java.lang.String])
  ] = js.undefined
  // Options passed to cli-table
  var tableOptions: js.UndefOr[js.Any] = js.undefined
  // Whether or not to undo marked escaping
  // of enitities (" -> &quot; etc)
  var unescape: js.UndefOr[scala.Boolean] = js.undefined
  // Reflow and print-out width
  var width: js.UndefOr[scala.Double] = js.undefined
}

object TerminalRendererOptions {
  @scala.inline
  def apply(
    blockquote: chalkLib.chalkMod.Chalk | (js.Function1[/* s */ java.lang.String, java.lang.String]) = null,
    code: chalkLib.chalkMod.Chalk | (js.Function1[/* s */ java.lang.String, java.lang.String]) = null,
    codespan: chalkLib.chalkMod.Chalk | (js.Function1[/* s */ java.lang.String, java.lang.String]) = null,
    del: chalkLib.chalkMod.Chalk | (js.Function1[/* s */ java.lang.String, java.lang.String]) = null,
    em: chalkLib.chalkMod.Chalk | (js.Function1[/* s */ java.lang.String, java.lang.String]) = null,
    emoji: js.UndefOr[scala.Boolean] = js.undefined,
    firstHeading: chalkLib.chalkMod.Chalk | (js.Function1[/* s */ java.lang.String, java.lang.String]) = null,
    heading: chalkLib.chalkMod.Chalk | (js.Function1[/* s */ java.lang.String, java.lang.String]) = null,
    hr: chalkLib.chalkMod.Chalk | (js.Function1[/* s */ java.lang.String, java.lang.String]) = null,
    href: chalkLib.chalkMod.Chalk | (js.Function1[/* s */ java.lang.String, java.lang.String]) = null,
    html: chalkLib.chalkMod.Chalk | (js.Function1[/* s */ java.lang.String, java.lang.String]) = null,
    link: chalkLib.chalkMod.Chalk | (js.Function1[/* s */ java.lang.String, java.lang.String]) = null,
    list: js.Function2[
      /* body */ java.lang.String, 
      /* ordered */ js.UndefOr[scala.Boolean], 
      java.lang.String
    ] = null,
    listitem: chalkLib.chalkMod.Chalk | (js.Function1[/* s */ java.lang.String, java.lang.String]) = null,
    paragraph: chalkLib.chalkMod.Chalk | (js.Function1[/* s */ java.lang.String, java.lang.String]) = null,
    reflowText: js.UndefOr[scala.Boolean] = js.undefined,
    showSectionPrefix: js.UndefOr[scala.Boolean] = js.undefined,
    strong: chalkLib.chalkMod.Chalk | (js.Function1[/* s */ java.lang.String, java.lang.String]) = null,
    tab: scala.Int | scala.Double = null,
    table: chalkLib.chalkMod.Chalk | (js.Function1[/* s */ java.lang.String, java.lang.String]) = null,
    tableOptions: js.Any = null,
    unescape: js.UndefOr[scala.Boolean] = js.undefined,
    width: scala.Int | scala.Double = null
  ): TerminalRendererOptions = {
    val __obj = js.Dynamic.literal()
    if (blockquote != null) __obj.updateDynamic("blockquote")(blockquote.asInstanceOf[js.Any])
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (codespan != null) __obj.updateDynamic("codespan")(codespan.asInstanceOf[js.Any])
    if (del != null) __obj.updateDynamic("del")(del.asInstanceOf[js.Any])
    if (em != null) __obj.updateDynamic("em")(em.asInstanceOf[js.Any])
    if (!js.isUndefined(emoji)) __obj.updateDynamic("emoji")(emoji)
    if (firstHeading != null) __obj.updateDynamic("firstHeading")(firstHeading.asInstanceOf[js.Any])
    if (heading != null) __obj.updateDynamic("heading")(heading.asInstanceOf[js.Any])
    if (hr != null) __obj.updateDynamic("hr")(hr.asInstanceOf[js.Any])
    if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    if (html != null) __obj.updateDynamic("html")(html.asInstanceOf[js.Any])
    if (link != null) __obj.updateDynamic("link")(link.asInstanceOf[js.Any])
    if (list != null) __obj.updateDynamic("list")(list)
    if (listitem != null) __obj.updateDynamic("listitem")(listitem.asInstanceOf[js.Any])
    if (paragraph != null) __obj.updateDynamic("paragraph")(paragraph.asInstanceOf[js.Any])
    if (!js.isUndefined(reflowText)) __obj.updateDynamic("reflowText")(reflowText)
    if (!js.isUndefined(showSectionPrefix)) __obj.updateDynamic("showSectionPrefix")(showSectionPrefix)
    if (strong != null) __obj.updateDynamic("strong")(strong.asInstanceOf[js.Any])
    if (tab != null) __obj.updateDynamic("tab")(tab.asInstanceOf[js.Any])
    if (table != null) __obj.updateDynamic("table")(table.asInstanceOf[js.Any])
    if (tableOptions != null) __obj.updateDynamic("tableOptions")(tableOptions)
    if (!js.isUndefined(unescape)) __obj.updateDynamic("unescape")(unescape)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[TerminalRendererOptions]
  }
}

