package typings
package jqueryDotFileuploadLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Interface options for the plugin
trait JQueryFileInputOptions extends js.Object {
  var active: js.UndefOr[js.Function] = js.undefined
  /**
    * The add callback is invoked as soon as files are added to the fileupload
    * widget (via file input selection, drag & drop, paste or add API call).
    * If the singleFileUploads option is enabled, this callback will be
    * called once for each file in the selection for XHR file uploads, else
    * once for each file selection.
    *
    * The upload starts when the submit method is invoked on the data parameter.
    * The data object contains a files property holding the added files
    * and allows you to override plugin options as well as define ajax settings.
    *
    * Listeners for this callback can also be bound the following way:
    * .bind('fileuploadadd', func);
    *
    * data.submit() returns a Promise object and allows to attach additional
    * handlers using jQuery's Deferred callbacks:
    * data.submit().done(func).fail(func).always(func);
    */
  var add: js.UndefOr[
    js.Function2[
      /* e */ jqueryLib.JQueryEventObject, 
      /* data */ JqueryFileUploadAddObject, 
      scala.Unit
    ]
  ] = js.undefined
  var always: js.UndefOr[
    js.Function2[/* e */ jqueryLib.JQueryEventObject, /* data */ JQueryFileInputOptions, scala.Unit]
  ] = js.undefined
  /**
    * By default, uploads are started automatically when adding files:
    */
  var autoUpload: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Interval in milliseconds to calculate progress bitrate:
    */
  var bitrateInterval: js.UndefOr[scala.Double] = js.undefined
  var cache: js.UndefOr[scala.Boolean] = js.undefined
  var change: js.UndefOr[
    js.Function2[
      /* e */ jqueryLib.JQueryEventObject, 
      /* data */ JQueryFileUploadChangeObject, 
      scala.Unit
    ]
  ] = js.undefined
  var chunkalways: js.UndefOr[
    js.Function2[
      /* e */ jqueryLib.JQueryEventObject, 
      /* data */ JQueryFileUploadChunkObject, 
      scala.Unit
    ]
  ] = js.undefined
  var chunkdone: js.UndefOr[
    js.Function2[
      /* e */ jqueryLib.JQueryEventObject, 
      /* data */ JQueryFileUploadChunkObject, 
      scala.Unit
    ]
  ] = js.undefined
  var chunkfail: js.UndefOr[
    js.Function2[
      /* e */ jqueryLib.JQueryEventObject, 
      /* data */ JQueryFileUploadChunkObject, 
      scala.Unit
    ]
  ] = js.undefined
  var chunksend: js.UndefOr[
    js.Function2[
      /* e */ jqueryLib.JQueryEventObject, 
      /* data */ JQueryFileUploadChunkObject, 
      scala.Unit
    ]
  ] = js.undefined
  var contentType: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The type of data that is expected back from the server.
    */
  var dataType: js.UndefOr[java.lang.String] = js.undefined
  var done: js.UndefOr[
    js.Function2[/* e */ jqueryLib.JQueryEventObject, /* data */ JQueryFileUploadDone, scala.Unit]
  ] = js.undefined
  var dragover: js.UndefOr[js.Function1[/* e */ jqueryLib.JQueryEventObject, scala.Unit]] = js.undefined
  var drop: js.UndefOr[
    js.Function2[
      /* e */ jqueryLib.JQueryEventObject, 
      /* data */ JQueryFileUploadFilesObject, 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * The drop target element(s), by the default the complete document.
    * Set to null to disable drag & drop support:
    */
  var dropZone: js.UndefOr[stdLib.Element | js.Array[stdLib.Element] | JQuery | java.lang.String] = js.undefined
  var fail: js.UndefOr[
    js.Function2[/* e */ jqueryLib.JQueryEventObject, /* data */ JQueryFileUploadDone, scala.Unit]
  ] = js.undefined
  /**
    * The file input field(s), that are listened to for change events.
    * If undefined, it is set to the file input fields inside
    * of the widget element on plugin initialization.
    * Set to null to disable the change listener.
    */
  var fileInput: js.UndefOr[stdLib.Element | js.Array[stdLib.Element] | JQuery | java.lang.String] = js.undefined
  var files: js.UndefOr[js.Any] = js.undefined
  /**
    * Set the following option to true to force iframe transport uploads:
    */
  var forceIframeTransport: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Additional form data to be sent along with the file uploads can be set
    * using this option, which accepts an array of objects with name and
    * value properties, a function returning such an array, a FormData
    * object (for XHR file uploads), or a simple object.
    * The form of the first fileInput is given as parameter to the function:
    */
  var formData: js.UndefOr[js.Any] = js.undefined
  /**
    * Translation function, gets the message key to be translated
    * and an object with context specific data as arguments:
    */
  var i18n: js.UndefOr[js.Any] = js.undefined
  /**
    * To limit the number of concurrent uploads,
    * set the following option to an integer greater than 0:
    */
  var limitConcurrentUploads: js.UndefOr[scala.Double] = js.undefined
  /**
    * The following option limits the number of files uploaded with one
    * XHR request to keep the request size under or equal to the defined
    * limit in bytes
    */
  var limitMultiFileUploadSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * Multipart file uploads add a number of bytes to each uploaded file,
    * therefore the following option adds an overhead for each file used
    * in the limitMultiFileUploadSize configuration:
    */
  var limitMultiFileUploadSizeOverhead: js.UndefOr[scala.Double] = js.undefined
  /**
    * To limit the number of files uploaded with one XHR request,
    * set the following option to an integer greater than 0:
    */
  var limitMultiFileUploads: js.UndefOr[scala.Double] = js.undefined
  /**
    * To upload large files in smaller chunks, set the following option
    * to a preferred maximum chunk size. If set to 0, null or undefined,
    * or the browser does not support the required Blob API, files will
    * be uploaded as a whole.
    */
  var maxChunkSize: js.UndefOr[scala.Double] = js.undefined
  // Validation
  /**
    * The maximum allowed file size in bytes.
    * Type: integer
    * Default: undefined
    * Example: 10000000 // 10 MB
    * Note: This option has only an effect for browsers supporting the File API.
    * @see https://github.com/blueimp/jQuery-File-Upload/wiki/Options#maxfilesize
    */
  var maxFileSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * Error and info messages:
    */
  var messages: js.UndefOr[js.Any] = js.undefined
  /**
    * By default, XHR file uploads are sent as multipart/form-data.
    * The iframe transport is always using multipart/form-data.
    * Set to false to enable non-multipart XHR uploads:
    */
  var multipart: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The parameter name for the file form data (the request argument name).
    * If undefined or empty, the name property of the file input field is
    * used, or "files[]" if the file input name property is also empty,
    * can be a string or an array of strings:
    */
  var paramName: js.UndefOr[js.Any] = js.undefined
  var paste: js.UndefOr[
    js.Function2[
      /* e */ jqueryLib.JQueryEventObject, 
      /* data */ JQueryFileUploadFilesObject, 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * The paste target element(s), by the default the complete document.
    * Set to null to disable paste support:
    */
  var pasteZone: js.UndefOr[stdLib.Element | js.Array[stdLib.Element] | JQuery | java.lang.String] = js.undefined
  /**
    * Set the following option to the location of a postMessage window,
    * to enable postMessage transport uploads:
    */
  var postMessage: js.UndefOr[java.lang.String] = js.undefined
  // The plugin options are used as settings object for the ajax calls.
  // The following are jQuery ajax settings required for the file uploads:
  var processData: js.UndefOr[scala.Boolean] = js.undefined
  var progress: js.UndefOr[
    js.Function2[
      /* e */ jqueryLib.JQueryEventObject, 
      /* data */ JQueryFileUploadProgressObject, 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Interval in milliseconds to calculate and trigger progress events:
    */
  var progressInterval: js.UndefOr[scala.Double] = js.undefined
  var progressall: js.UndefOr[
    js.Function2[
      /* e */ jqueryLib.JQueryEventObject, 
      /* data */ JQueryFileUploadProgressAllObject, 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * By default, failed (abort or error) file uploads are removed from the
    * global progress calculation. Set the following option to false to
    * prevent recalculating the global progress data:
    */
  var recalculateProgress: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Set the following option to the location of a redirect url on the
    * origin server, for cross-domain iframe transport uploads:
    */
  var redirect: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The parameter name for the redirect url, sent as part of the form
    * data and set to 'redirect' if this option is empty:
    */
  var redirectParamName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * By default, the file input field is replaced with a clone after
    * each input field change event. This is required for iframe transport
    * queues and allows change events to be fired for the same file
    * selection, but can be disabled by setting the following option to false:
    */
  var replaceFileInput: js.UndefOr[scala.Boolean] = js.undefined
  var send: js.UndefOr[
    js.Function2[
      /* e */ jqueryLib.JQueryEventObject, 
      /* data */ JQueryFileUploadProgressObject, 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Set the following option to true to issue all file upload requests
    * in a sequential order:
    */
  var sequentialUploads: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * By default, each file of a selection is uploaded using an individual
    * request for XHR type uploads. Set to false to upload file
    * selections in one request each:
    */
  var singleFileUploads: js.UndefOr[scala.Boolean] = js.undefined
  var start: js.UndefOr[js.Function1[/* e */ jqueryLib.JQueryEventObject, scala.Unit]] = js.undefined
  var stop: js.UndefOr[js.Function1[/* e */ jqueryLib.JQueryEventObject, scala.Unit]] = js.undefined
  // Other callbacks:
  var submit: js.UndefOr[js.Function] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
  // The HTTP request method must be "POST" or "PUT"
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /**
    * When a non-multipart upload or a chunked multipart upload has been
    * aborted, this option can be used to resume the upload by setting
    * it to the size of the already uploaded bytes. This option is most
    * useful when modifying the options object inside of the "add" or
    * "send" callbacks, as the options are cloned for each file upload.
    */
  var uploadedBytes: js.UndefOr[scala.Double] = js.undefined
  // Others
  var url: js.UndefOr[java.lang.String] = js.undefined
  // Cross-site XMLHttpRequest file uploads
  var xhrFields: js.UndefOr[js.Any] = js.undefined
}

object JQueryFileInputOptions {
  @scala.inline
  def apply(
    active: js.Function = null,
    add: js.Function2[
      /* e */ jqueryLib.JQueryEventObject, 
      /* data */ JqueryFileUploadAddObject, 
      scala.Unit
    ] = null,
    always: js.Function2[/* e */ jqueryLib.JQueryEventObject, /* data */ JQueryFileInputOptions, scala.Unit] = null,
    autoUpload: js.UndefOr[scala.Boolean] = js.undefined,
    bitrateInterval: scala.Int | scala.Double = null,
    cache: js.UndefOr[scala.Boolean] = js.undefined,
    change: js.Function2[
      /* e */ jqueryLib.JQueryEventObject, 
      /* data */ JQueryFileUploadChangeObject, 
      scala.Unit
    ] = null,
    chunkalways: js.Function2[
      /* e */ jqueryLib.JQueryEventObject, 
      /* data */ JQueryFileUploadChunkObject, 
      scala.Unit
    ] = null,
    chunkdone: js.Function2[
      /* e */ jqueryLib.JQueryEventObject, 
      /* data */ JQueryFileUploadChunkObject, 
      scala.Unit
    ] = null,
    chunkfail: js.Function2[
      /* e */ jqueryLib.JQueryEventObject, 
      /* data */ JQueryFileUploadChunkObject, 
      scala.Unit
    ] = null,
    chunksend: js.Function2[
      /* e */ jqueryLib.JQueryEventObject, 
      /* data */ JQueryFileUploadChunkObject, 
      scala.Unit
    ] = null,
    contentType: java.lang.String = null,
    dataType: java.lang.String = null,
    done: js.Function2[/* e */ jqueryLib.JQueryEventObject, /* data */ JQueryFileUploadDone, scala.Unit] = null,
    dragover: js.Function1[/* e */ jqueryLib.JQueryEventObject, scala.Unit] = null,
    drop: js.Function2[
      /* e */ jqueryLib.JQueryEventObject, 
      /* data */ JQueryFileUploadFilesObject, 
      scala.Unit
    ] = null,
    dropZone: stdLib.Element | js.Array[stdLib.Element] | JQuery | java.lang.String = null,
    fail: js.Function2[/* e */ jqueryLib.JQueryEventObject, /* data */ JQueryFileUploadDone, scala.Unit] = null,
    fileInput: stdLib.Element | js.Array[stdLib.Element] | JQuery | java.lang.String = null,
    files: js.Any = null,
    forceIframeTransport: js.UndefOr[scala.Boolean] = js.undefined,
    formData: js.Any = null,
    i18n: js.Any = null,
    limitConcurrentUploads: scala.Int | scala.Double = null,
    limitMultiFileUploadSize: scala.Int | scala.Double = null,
    limitMultiFileUploadSizeOverhead: scala.Int | scala.Double = null,
    limitMultiFileUploads: scala.Int | scala.Double = null,
    maxChunkSize: scala.Int | scala.Double = null,
    maxFileSize: scala.Int | scala.Double = null,
    messages: js.Any = null,
    multipart: js.UndefOr[scala.Boolean] = js.undefined,
    paramName: js.Any = null,
    paste: js.Function2[
      /* e */ jqueryLib.JQueryEventObject, 
      /* data */ JQueryFileUploadFilesObject, 
      scala.Unit
    ] = null,
    pasteZone: stdLib.Element | js.Array[stdLib.Element] | JQuery | java.lang.String = null,
    postMessage: java.lang.String = null,
    processData: js.UndefOr[scala.Boolean] = js.undefined,
    progress: js.Function2[
      /* e */ jqueryLib.JQueryEventObject, 
      /* data */ JQueryFileUploadProgressObject, 
      scala.Unit
    ] = null,
    progressInterval: scala.Int | scala.Double = null,
    progressall: js.Function2[
      /* e */ jqueryLib.JQueryEventObject, 
      /* data */ JQueryFileUploadProgressAllObject, 
      scala.Unit
    ] = null,
    recalculateProgress: js.UndefOr[scala.Boolean] = js.undefined,
    redirect: java.lang.String = null,
    redirectParamName: java.lang.String = null,
    replaceFileInput: js.UndefOr[scala.Boolean] = js.undefined,
    send: js.Function2[
      /* e */ jqueryLib.JQueryEventObject, 
      /* data */ JQueryFileUploadProgressObject, 
      scala.Unit
    ] = null,
    sequentialUploads: js.UndefOr[scala.Boolean] = js.undefined,
    singleFileUploads: js.UndefOr[scala.Boolean] = js.undefined,
    start: js.Function1[/* e */ jqueryLib.JQueryEventObject, scala.Unit] = null,
    stop: js.Function1[/* e */ jqueryLib.JQueryEventObject, scala.Unit] = null,
    submit: js.Function = null,
    timeout: scala.Int | scala.Double = null,
    `type`: java.lang.String = null,
    uploadedBytes: scala.Int | scala.Double = null,
    url: java.lang.String = null,
    xhrFields: js.Any = null
  ): JQueryFileInputOptions = {
    val __obj = js.Dynamic.literal()
    if (active != null) __obj.updateDynamic("active")(active)
    if (add != null) __obj.updateDynamic("add")(add)
    if (always != null) __obj.updateDynamic("always")(always)
    if (!js.isUndefined(autoUpload)) __obj.updateDynamic("autoUpload")(autoUpload)
    if (bitrateInterval != null) __obj.updateDynamic("bitrateInterval")(bitrateInterval.asInstanceOf[js.Any])
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache)
    if (change != null) __obj.updateDynamic("change")(change)
    if (chunkalways != null) __obj.updateDynamic("chunkalways")(chunkalways)
    if (chunkdone != null) __obj.updateDynamic("chunkdone")(chunkdone)
    if (chunkfail != null) __obj.updateDynamic("chunkfail")(chunkfail)
    if (chunksend != null) __obj.updateDynamic("chunksend")(chunksend)
    if (contentType != null) __obj.updateDynamic("contentType")(contentType)
    if (dataType != null) __obj.updateDynamic("dataType")(dataType)
    if (done != null) __obj.updateDynamic("done")(done)
    if (dragover != null) __obj.updateDynamic("dragover")(dragover)
    if (drop != null) __obj.updateDynamic("drop")(drop)
    if (dropZone != null) __obj.updateDynamic("dropZone")(dropZone.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (fileInput != null) __obj.updateDynamic("fileInput")(fileInput.asInstanceOf[js.Any])
    if (files != null) __obj.updateDynamic("files")(files)
    if (!js.isUndefined(forceIframeTransport)) __obj.updateDynamic("forceIframeTransport")(forceIframeTransport)
    if (formData != null) __obj.updateDynamic("formData")(formData)
    if (i18n != null) __obj.updateDynamic("i18n")(i18n)
    if (limitConcurrentUploads != null) __obj.updateDynamic("limitConcurrentUploads")(limitConcurrentUploads.asInstanceOf[js.Any])
    if (limitMultiFileUploadSize != null) __obj.updateDynamic("limitMultiFileUploadSize")(limitMultiFileUploadSize.asInstanceOf[js.Any])
    if (limitMultiFileUploadSizeOverhead != null) __obj.updateDynamic("limitMultiFileUploadSizeOverhead")(limitMultiFileUploadSizeOverhead.asInstanceOf[js.Any])
    if (limitMultiFileUploads != null) __obj.updateDynamic("limitMultiFileUploads")(limitMultiFileUploads.asInstanceOf[js.Any])
    if (maxChunkSize != null) __obj.updateDynamic("maxChunkSize")(maxChunkSize.asInstanceOf[js.Any])
    if (maxFileSize != null) __obj.updateDynamic("maxFileSize")(maxFileSize.asInstanceOf[js.Any])
    if (messages != null) __obj.updateDynamic("messages")(messages)
    if (!js.isUndefined(multipart)) __obj.updateDynamic("multipart")(multipart)
    if (paramName != null) __obj.updateDynamic("paramName")(paramName)
    if (paste != null) __obj.updateDynamic("paste")(paste)
    if (pasteZone != null) __obj.updateDynamic("pasteZone")(pasteZone.asInstanceOf[js.Any])
    if (postMessage != null) __obj.updateDynamic("postMessage")(postMessage)
    if (!js.isUndefined(processData)) __obj.updateDynamic("processData")(processData)
    if (progress != null) __obj.updateDynamic("progress")(progress)
    if (progressInterval != null) __obj.updateDynamic("progressInterval")(progressInterval.asInstanceOf[js.Any])
    if (progressall != null) __obj.updateDynamic("progressall")(progressall)
    if (!js.isUndefined(recalculateProgress)) __obj.updateDynamic("recalculateProgress")(recalculateProgress)
    if (redirect != null) __obj.updateDynamic("redirect")(redirect)
    if (redirectParamName != null) __obj.updateDynamic("redirectParamName")(redirectParamName)
    if (!js.isUndefined(replaceFileInput)) __obj.updateDynamic("replaceFileInput")(replaceFileInput)
    if (send != null) __obj.updateDynamic("send")(send)
    if (!js.isUndefined(sequentialUploads)) __obj.updateDynamic("sequentialUploads")(sequentialUploads)
    if (!js.isUndefined(singleFileUploads)) __obj.updateDynamic("singleFileUploads")(singleFileUploads)
    if (start != null) __obj.updateDynamic("start")(start)
    if (stop != null) __obj.updateDynamic("stop")(stop)
    if (submit != null) __obj.updateDynamic("submit")(submit)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (uploadedBytes != null) __obj.updateDynamic("uploadedBytes")(uploadedBytes.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url)
    if (xhrFields != null) __obj.updateDynamic("xhrFields")(xhrFields)
    __obj.asInstanceOf[JQueryFileInputOptions]
  }
}

