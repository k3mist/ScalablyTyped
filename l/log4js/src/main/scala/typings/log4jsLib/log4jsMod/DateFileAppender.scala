package typings
package log4jsLib.log4jsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateFileAppender extends Appender {
  // include the pattern in the name of the current log file as well as the backups.(default false)
  var alwaysIncludePattern: js.UndefOr[scala.Boolean] = js.undefined
  // compress the backup files during rolling (backup files will have .gz extension)(default false)
  var compress: js.UndefOr[scala.Boolean] = js.undefined
  // if this value is greater than zero, then files older than that many days will be deleted during log rolling.(default 0)
  var daysToKeep: js.UndefOr[scala.Double] = js.undefined
  // default “utf-8”
  var encoding: js.UndefOr[java.lang.String] = js.undefined
  // the path of the file where you want your logs written.
  var filename: java.lang.String
  // default ‘a’
  var flags: js.UndefOr[java.lang.String] = js.undefined
  // keep the file extension when rotating logs
  var keepFileExt: js.UndefOr[scala.Boolean] = js.undefined
  // defaults to basic layout
  var layout: js.UndefOr[Layout] = js.undefined
  // default 0644
  var mode: js.UndefOr[scala.Double] = js.undefined
  // defaults to .yyyy-MM-dd - the pattern to use to determine when to roll the logs.
  /**
  	 * The following strings are recognised in the pattern:
  	 *  - yyyy : the full year, use yy for just the last two digits
  	 *  - MM   : the month
  	 *  - dd   : the day of the month
  	 *  - hh   : the hour of the day (24-hour clock)
  	 *  - mm   : the minute of the hour
  	 *  - ss   : seconds
  	 *  - SSS  : milliseconds (although I'm not sure you'd want to roll your logs every millisecond)
  	 *  - O    : timezone (capital letter o)
  	 */
  var pattern: js.UndefOr[java.lang.String] = js.undefined
  var `type`: log4jsLib.log4jsLibStrings.dateFile
}

object DateFileAppender {
  @scala.inline
  def apply(
    filename: java.lang.String,
    `type`: log4jsLib.log4jsLibStrings.dateFile,
    alwaysIncludePattern: js.UndefOr[scala.Boolean] = js.undefined,
    compress: js.UndefOr[scala.Boolean] = js.undefined,
    daysToKeep: scala.Int | scala.Double = null,
    encoding: java.lang.String = null,
    flags: java.lang.String = null,
    keepFileExt: js.UndefOr[scala.Boolean] = js.undefined,
    layout: Layout = null,
    mode: scala.Int | scala.Double = null,
    pattern: java.lang.String = null
  ): DateFileAppender = {
    val __obj = js.Dynamic.literal(filename = filename, `type` = `type`)
    if (!js.isUndefined(alwaysIncludePattern)) __obj.updateDynamic("alwaysIncludePattern")(alwaysIncludePattern)
    if (!js.isUndefined(compress)) __obj.updateDynamic("compress")(compress)
    if (daysToKeep != null) __obj.updateDynamic("daysToKeep")(daysToKeep.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (flags != null) __obj.updateDynamic("flags")(flags)
    if (!js.isUndefined(keepFileExt)) __obj.updateDynamic("keepFileExt")(keepFileExt)
    if (layout != null) __obj.updateDynamic("layout")(layout)
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (pattern != null) __obj.updateDynamic("pattern")(pattern)
    __obj.asInstanceOf[DateFileAppender]
  }
}

