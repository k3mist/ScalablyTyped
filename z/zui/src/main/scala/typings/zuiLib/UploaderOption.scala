package typings
package zuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * uploader
  */
trait UploaderOption extends js.Object {
  var autoUpload: js.UndefOr[scala.Boolean] = js.undefined
  var browseByClickList: js.UndefOr[scala.Boolean] = js.undefined
  var browse_button: js.UndefOr[java.lang.String] = js.undefined
  var chunk_size: js.UndefOr[java.lang.String] = js.undefined
  var deleteActionOnDone: js.UndefOr[scala.Boolean] = js.undefined
  var deleteConfirm: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  var dropPlaceholder: js.UndefOr[scala.Boolean] = js.undefined
  var drop_element: js.UndefOr[java.lang.String] = js.undefined
  var fileFormater: js.UndefOr[
    js.Function3[/* $file */ JQuery, /* file */ FileObj, /* status */ STATUS, scala.Unit]
  ] = js.undefined
  var fileIconCreator: js.UndefOr[
    js.Function3[
      /* fileType */ java.lang.String, 
      /* file */ FileObj, 
      /* uploader */ Uploader, 
      scala.Unit
    ]
  ] = js.undefined
  var fileList: js.UndefOr[java.lang.String] = js.undefined
  var fileTemplate: js.UndefOr[java.lang.String] = js.undefined
  var file_data_name: js.UndefOr[java.lang.String] = js.undefined
  var filters: js.UndefOr[Anon_Maxfilesize] = js.undefined
  var flash_swf_url: js.UndefOr[java.lang.String] = js.undefined
  var headers: js.UndefOr[js.Object] = js.undefined
  var lang: js.UndefOr[java.lang.String] = js.undefined
  var limitFilesCount: js.UndefOr[scala.Boolean | scala.Double] = js.undefined
  var max_retries: js.UndefOr[scala.Double] = js.undefined
  var multi_selection: js.UndefOr[scala.Boolean] = js.undefined
  var multipart: js.UndefOr[scala.Boolean] = js.undefined
  var multipart_params: js.UndefOr[js.Object | CallBack] = js.undefined
  var onBeforeUpload: js.UndefOr[js.Function1[/* file */ FileObj, scala.Unit]] = js.undefined
  var onChunkUploaded: js.UndefOr[
    js.Function2[/* file */ FileObj, /* responseObject */ ResponseObject, scala.Unit]
  ] = js.undefined
  var onError: js.UndefOr[js.Function1[/* error */ Anon_Error, scala.Unit]] = js.undefined
  var onFileUploaded: js.UndefOr[
    js.Function2[/* file */ FileObj, /* responseObject */ ResponseObject, scala.Unit]
  ] = js.undefined
  var onFilesAdded: js.UndefOr[js.Function1[/* fiels */ js.Array[FileObj], scala.Unit]] = js.undefined
  var onFilesRemoved: js.UndefOr[js.Function1[/* files */ js.Array[FileObj], scala.Unit]] = js.undefined
  var onInit: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onQueueChanged: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onStateChanged: js.UndefOr[js.Function1[/* status */ STATUS, scala.Unit]] = js.undefined
  var onUploadComplete: js.UndefOr[js.Function1[/* files */ js.Array[FileObj], scala.Unit]] = js.undefined
  var onUploadFile: js.UndefOr[js.Function1[/* file */ FileObj, scala.Unit]] = js.undefined
  var onUploadProgress: js.UndefOr[js.Function1[/* file */ FileObj, scala.Unit]] = js.undefined
  var previewImageIcon: js.UndefOr[scala.Boolean] = js.undefined
  var previewImageSize: js.UndefOr[Anon_Height] = js.undefined
  var qiniu: js.UndefOr[js.Object] = js.undefined
  var removeUploaded: js.UndefOr[scala.Boolean] = js.undefined
  var rename: js.UndefOr[scala.Boolean] = js.undefined
  var renameActionOnDone: js.UndefOr[scala.Boolean] = js.undefined
  var renameByClick: js.UndefOr[scala.Boolean] = js.undefined
  var renameExtension: js.UndefOr[scala.Boolean] = js.undefined
  var resize: js.UndefOr[Anon_Crop] = js.undefined
  var responseHandler: js.UndefOr[scala.Boolean | CallBack] = js.undefined
  var runtimes: js.UndefOr[java.lang.String] = js.undefined
  var sendFileId: js.UndefOr[scala.Boolean] = js.undefined
  var sendFileName: js.UndefOr[scala.Boolean] = js.undefined
  var silverlight_xap_url: js.UndefOr[java.lang.String] = js.undefined
  var staticFiles: js.UndefOr[js.Array[Anon_Id]] = js.undefined
  var statusCreator: js.UndefOr[
    js.Function3[/* total */ UploadProgress, /* state */ STATUS, /* uploader */ Uploader, scala.Unit]
  ] = js.undefined
  var unique_names: js.UndefOr[scala.Boolean] = js.undefined
  var uploadedMessage: js.UndefOr[scala.Boolean] = js.undefined
  var url: java.lang.String
}

object UploaderOption {
  @scala.inline
  def apply(
    url: java.lang.String,
    autoUpload: js.UndefOr[scala.Boolean] = js.undefined,
    browseByClickList: js.UndefOr[scala.Boolean] = js.undefined,
    browse_button: java.lang.String = null,
    chunk_size: java.lang.String = null,
    deleteActionOnDone: js.UndefOr[scala.Boolean] = js.undefined,
    deleteConfirm: scala.Boolean | java.lang.String = null,
    dropPlaceholder: js.UndefOr[scala.Boolean] = js.undefined,
    drop_element: java.lang.String = null,
    fileFormater: js.Function3[/* $file */ JQuery, /* file */ FileObj, /* status */ STATUS, scala.Unit] = null,
    fileIconCreator: js.Function3[
      /* fileType */ java.lang.String, 
      /* file */ FileObj, 
      /* uploader */ Uploader, 
      scala.Unit
    ] = null,
    fileList: java.lang.String = null,
    fileTemplate: java.lang.String = null,
    file_data_name: java.lang.String = null,
    filters: Anon_Maxfilesize = null,
    flash_swf_url: java.lang.String = null,
    headers: js.Object = null,
    lang: java.lang.String = null,
    limitFilesCount: scala.Boolean | scala.Double = null,
    max_retries: scala.Int | scala.Double = null,
    multi_selection: js.UndefOr[scala.Boolean] = js.undefined,
    multipart: js.UndefOr[scala.Boolean] = js.undefined,
    multipart_params: js.Object | CallBack = null,
    onBeforeUpload: js.Function1[/* file */ FileObj, scala.Unit] = null,
    onChunkUploaded: js.Function2[/* file */ FileObj, /* responseObject */ ResponseObject, scala.Unit] = null,
    onError: js.Function1[/* error */ Anon_Error, scala.Unit] = null,
    onFileUploaded: js.Function2[/* file */ FileObj, /* responseObject */ ResponseObject, scala.Unit] = null,
    onFilesAdded: js.Function1[/* fiels */ js.Array[FileObj], scala.Unit] = null,
    onFilesRemoved: js.Function1[/* files */ js.Array[FileObj], scala.Unit] = null,
    onInit: js.Function0[scala.Unit] = null,
    onQueueChanged: js.Function0[scala.Unit] = null,
    onStateChanged: js.Function1[/* status */ STATUS, scala.Unit] = null,
    onUploadComplete: js.Function1[/* files */ js.Array[FileObj], scala.Unit] = null,
    onUploadFile: js.Function1[/* file */ FileObj, scala.Unit] = null,
    onUploadProgress: js.Function1[/* file */ FileObj, scala.Unit] = null,
    previewImageIcon: js.UndefOr[scala.Boolean] = js.undefined,
    previewImageSize: Anon_Height = null,
    qiniu: js.Object = null,
    removeUploaded: js.UndefOr[scala.Boolean] = js.undefined,
    rename: js.UndefOr[scala.Boolean] = js.undefined,
    renameActionOnDone: js.UndefOr[scala.Boolean] = js.undefined,
    renameByClick: js.UndefOr[scala.Boolean] = js.undefined,
    renameExtension: js.UndefOr[scala.Boolean] = js.undefined,
    resize: Anon_Crop = null,
    responseHandler: scala.Boolean | CallBack = null,
    runtimes: java.lang.String = null,
    sendFileId: js.UndefOr[scala.Boolean] = js.undefined,
    sendFileName: js.UndefOr[scala.Boolean] = js.undefined,
    silverlight_xap_url: java.lang.String = null,
    staticFiles: js.Array[Anon_Id] = null,
    statusCreator: js.Function3[/* total */ UploadProgress, /* state */ STATUS, /* uploader */ Uploader, scala.Unit] = null,
    unique_names: js.UndefOr[scala.Boolean] = js.undefined,
    uploadedMessage: js.UndefOr[scala.Boolean] = js.undefined
  ): UploaderOption = {
    val __obj = js.Dynamic.literal(url = url)
    if (!js.isUndefined(autoUpload)) __obj.updateDynamic("autoUpload")(autoUpload)
    if (!js.isUndefined(browseByClickList)) __obj.updateDynamic("browseByClickList")(browseByClickList)
    if (browse_button != null) __obj.updateDynamic("browse_button")(browse_button)
    if (chunk_size != null) __obj.updateDynamic("chunk_size")(chunk_size)
    if (!js.isUndefined(deleteActionOnDone)) __obj.updateDynamic("deleteActionOnDone")(deleteActionOnDone)
    if (deleteConfirm != null) __obj.updateDynamic("deleteConfirm")(deleteConfirm.asInstanceOf[js.Any])
    if (!js.isUndefined(dropPlaceholder)) __obj.updateDynamic("dropPlaceholder")(dropPlaceholder)
    if (drop_element != null) __obj.updateDynamic("drop_element")(drop_element)
    if (fileFormater != null) __obj.updateDynamic("fileFormater")(fileFormater)
    if (fileIconCreator != null) __obj.updateDynamic("fileIconCreator")(fileIconCreator)
    if (fileList != null) __obj.updateDynamic("fileList")(fileList)
    if (fileTemplate != null) __obj.updateDynamic("fileTemplate")(fileTemplate)
    if (file_data_name != null) __obj.updateDynamic("file_data_name")(file_data_name)
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (flash_swf_url != null) __obj.updateDynamic("flash_swf_url")(flash_swf_url)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (lang != null) __obj.updateDynamic("lang")(lang)
    if (limitFilesCount != null) __obj.updateDynamic("limitFilesCount")(limitFilesCount.asInstanceOf[js.Any])
    if (max_retries != null) __obj.updateDynamic("max_retries")(max_retries.asInstanceOf[js.Any])
    if (!js.isUndefined(multi_selection)) __obj.updateDynamic("multi_selection")(multi_selection)
    if (!js.isUndefined(multipart)) __obj.updateDynamic("multipart")(multipart)
    if (multipart_params != null) __obj.updateDynamic("multipart_params")(multipart_params.asInstanceOf[js.Any])
    if (onBeforeUpload != null) __obj.updateDynamic("onBeforeUpload")(onBeforeUpload)
    if (onChunkUploaded != null) __obj.updateDynamic("onChunkUploaded")(onChunkUploaded)
    if (onError != null) __obj.updateDynamic("onError")(onError)
    if (onFileUploaded != null) __obj.updateDynamic("onFileUploaded")(onFileUploaded)
    if (onFilesAdded != null) __obj.updateDynamic("onFilesAdded")(onFilesAdded)
    if (onFilesRemoved != null) __obj.updateDynamic("onFilesRemoved")(onFilesRemoved)
    if (onInit != null) __obj.updateDynamic("onInit")(onInit)
    if (onQueueChanged != null) __obj.updateDynamic("onQueueChanged")(onQueueChanged)
    if (onStateChanged != null) __obj.updateDynamic("onStateChanged")(onStateChanged)
    if (onUploadComplete != null) __obj.updateDynamic("onUploadComplete")(onUploadComplete)
    if (onUploadFile != null) __obj.updateDynamic("onUploadFile")(onUploadFile)
    if (onUploadProgress != null) __obj.updateDynamic("onUploadProgress")(onUploadProgress)
    if (!js.isUndefined(previewImageIcon)) __obj.updateDynamic("previewImageIcon")(previewImageIcon)
    if (previewImageSize != null) __obj.updateDynamic("previewImageSize")(previewImageSize)
    if (qiniu != null) __obj.updateDynamic("qiniu")(qiniu)
    if (!js.isUndefined(removeUploaded)) __obj.updateDynamic("removeUploaded")(removeUploaded)
    if (!js.isUndefined(rename)) __obj.updateDynamic("rename")(rename)
    if (!js.isUndefined(renameActionOnDone)) __obj.updateDynamic("renameActionOnDone")(renameActionOnDone)
    if (!js.isUndefined(renameByClick)) __obj.updateDynamic("renameByClick")(renameByClick)
    if (!js.isUndefined(renameExtension)) __obj.updateDynamic("renameExtension")(renameExtension)
    if (resize != null) __obj.updateDynamic("resize")(resize)
    if (responseHandler != null) __obj.updateDynamic("responseHandler")(responseHandler.asInstanceOf[js.Any])
    if (runtimes != null) __obj.updateDynamic("runtimes")(runtimes)
    if (!js.isUndefined(sendFileId)) __obj.updateDynamic("sendFileId")(sendFileId)
    if (!js.isUndefined(sendFileName)) __obj.updateDynamic("sendFileName")(sendFileName)
    if (silverlight_xap_url != null) __obj.updateDynamic("silverlight_xap_url")(silverlight_xap_url)
    if (staticFiles != null) __obj.updateDynamic("staticFiles")(staticFiles)
    if (statusCreator != null) __obj.updateDynamic("statusCreator")(statusCreator)
    if (!js.isUndefined(unique_names)) __obj.updateDynamic("unique_names")(unique_names)
    if (!js.isUndefined(uploadedMessage)) __obj.updateDynamic("uploadedMessage")(uploadedMessage)
    __obj.asInstanceOf[UploaderOption]
  }
}

