package typings
package reactDashFilepondLib.reactDashFilepondMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Note that in my testing, callbacks that include an error prop
  * always give the error as the second prop, with the file as
  * the first prop.    This is contradictory to the current docs.
  */
trait FilePondCallbackProps extends js.Object {
  /** If no error, file has been successfully loaded */
  var onaddfile: js.UndefOr[js.Function2[/* file */ File, /* error */ FilePondErrorDescription, scala.Unit]] = js.undefined
  /** Made progress loading a file */
  var onaddfileprogress: js.UndefOr[js.Function2[/* file */ File, /* progress */ scala.Double, scala.Unit]] = js.undefined
  /** Started file load */
  var onaddfilestart: js.UndefOr[js.Function1[/* file */ File, scala.Unit]] = js.undefined
  /**
    * FilePond instance throws an error. Optionally receives
    * file if error is related to a file object.
    */
  var onerror: js.UndefOr[
    js.Function3[
      /* file */ js.UndefOr[File], 
      /* error */ js.UndefOr[FilePondErrorDescription], 
      /* status */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
  /** FilePond instance has been created and is ready. */
  var oninit: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * File has been transformed by the transform plugin or
    * another plugin subscribing to the prepare_output filter.
    * It receives the file item and the output data.
    */
  var onpreparefile: js.UndefOr[js.Function2[/* file */ File, /* output */ js.Any, scala.Unit]] = js.undefined
  /** If no error, Processing of a file has been completed */
  var onprocessfile: js.UndefOr[js.Function2[/* file */ File, /* error */ FilePondErrorDescription, scala.Unit]] = js.undefined
  /** Aborted processing of a file */
  var onprocessfileabort: js.UndefOr[js.Function1[/* file */ File, scala.Unit]] = js.undefined
  /** Made progress processing a file */
  var onprocessfileprogress: js.UndefOr[js.Function2[/* file */ File, /* progress */ scala.Double, scala.Unit]] = js.undefined
  /** Started processing a file */
  var onprocessfilestart: js.UndefOr[js.Function1[/* file */ File, scala.Unit]] = js.undefined
  /** Processing of a file has been undone */
  var onprocessfileundo: js.UndefOr[js.Function1[/* file */ File, scala.Unit]] = js.undefined
  /** File has been removed. */
  var onremovefile: js.UndefOr[js.Function1[/* file */ File, scala.Unit]] = js.undefined
  /** A file has been added or removed, receives a list of file items */
  var onupdatefiles: js.UndefOr[js.Function1[/* fileItems */ js.Array[File], scala.Unit]] = js.undefined
  /**
    * FilePond instance throws a warning. For instance
    * when the maximum amount of files has been reached.
    * Optionally receives file if error is related to a
    * file object
    */
  var onwarning: js.UndefOr[
    js.Function3[
      /* error */ js.Any, 
      /* file */ js.UndefOr[File], 
      /* status */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
}

object FilePondCallbackProps {
  @scala.inline
  def apply(
    onaddfile: js.Function2[/* file */ File, /* error */ FilePondErrorDescription, scala.Unit] = null,
    onaddfileprogress: js.Function2[/* file */ File, /* progress */ scala.Double, scala.Unit] = null,
    onaddfilestart: js.Function1[/* file */ File, scala.Unit] = null,
    onerror: js.Function3[
      /* file */ js.UndefOr[File], 
      /* error */ js.UndefOr[FilePondErrorDescription], 
      /* status */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    oninit: js.Function0[scala.Unit] = null,
    onpreparefile: js.Function2[/* file */ File, /* output */ js.Any, scala.Unit] = null,
    onprocessfile: js.Function2[/* file */ File, /* error */ FilePondErrorDescription, scala.Unit] = null,
    onprocessfileabort: js.Function1[/* file */ File, scala.Unit] = null,
    onprocessfileprogress: js.Function2[/* file */ File, /* progress */ scala.Double, scala.Unit] = null,
    onprocessfilestart: js.Function1[/* file */ File, scala.Unit] = null,
    onprocessfileundo: js.Function1[/* file */ File, scala.Unit] = null,
    onremovefile: js.Function1[/* file */ File, scala.Unit] = null,
    onupdatefiles: js.Function1[/* fileItems */ js.Array[File], scala.Unit] = null,
    onwarning: js.Function3[
      /* error */ js.Any, 
      /* file */ js.UndefOr[File], 
      /* status */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null
  ): FilePondCallbackProps = {
    val __obj = js.Dynamic.literal()
    if (onaddfile != null) __obj.updateDynamic("onaddfile")(onaddfile)
    if (onaddfileprogress != null) __obj.updateDynamic("onaddfileprogress")(onaddfileprogress)
    if (onaddfilestart != null) __obj.updateDynamic("onaddfilestart")(onaddfilestart)
    if (onerror != null) __obj.updateDynamic("onerror")(onerror)
    if (oninit != null) __obj.updateDynamic("oninit")(oninit)
    if (onpreparefile != null) __obj.updateDynamic("onpreparefile")(onpreparefile)
    if (onprocessfile != null) __obj.updateDynamic("onprocessfile")(onprocessfile)
    if (onprocessfileabort != null) __obj.updateDynamic("onprocessfileabort")(onprocessfileabort)
    if (onprocessfileprogress != null) __obj.updateDynamic("onprocessfileprogress")(onprocessfileprogress)
    if (onprocessfilestart != null) __obj.updateDynamic("onprocessfilestart")(onprocessfilestart)
    if (onprocessfileundo != null) __obj.updateDynamic("onprocessfileundo")(onprocessfileundo)
    if (onremovefile != null) __obj.updateDynamic("onremovefile")(onremovefile)
    if (onupdatefiles != null) __obj.updateDynamic("onupdatefiles")(onupdatefiles)
    if (onwarning != null) __obj.updateDynamic("onwarning")(onwarning)
    __obj.asInstanceOf[FilePondCallbackProps]
  }
}

