package typings
package atPulumiAwsLib.lambdaLambdaMixinsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context extends js.Object {
  /**
    * AWS request ID associated with the request. This is the ID returned to the client that called
    * the invoke method.
    *
    * If AWS Lambda retries the invocation (for example, in a situation where the Lambda function
    * that is processing Kinesis records throws an exception), the request ID remains the same.
    */
  val awsRequestId: java.lang.String
  /**
    * The default value is true. This property is useful only to modify the default behavior of the
    * callback. By default, the callback will wait until the event loop is empty before freezing
    * the process and returning the results to the caller. You can set this property to false to
    * request AWS Lambda to freeze the process soon after the callback is called, even if there are
    * events in the event loop. AWS Lambda will freeze the process, any state data and the events
    * in the event loop (any remaining events in the event loop processed when the Lambda function
    * is called next and if AWS Lambda chooses to use the frozen process).
    */
  var callbackWaitsForEmptyEventLoop: scala.Boolean
  /**
    * Information about the client application and device when invoked through the AWS Mobile SDK.
    * It can be null.
    */
  val clientContext: js.Any
  /**
    * Name of the Lambda function that is executing.
    */
  val functionName: java.lang.String
  /**
    * The Lambda function version that is executing. If an alias is used to invoke the function,
    * then function_version will be the version the alias points to.
    */
  val functionVersion: java.lang.String
  /**
    * Information about the Amazon Cognito identity provider when invoked through the AWS Mobile
    * SDK. It can be null.
    */
  val identity: js.Any
  /**
    * The ARN used to invoke this function. It can be a function ARN or an alias ARN. An
    * unqualified ARN executes the $LATEST version and aliases execute the function version it is
    * pointing to.
    */
  val invokedFunctionArn: java.lang.String
  /**
    * The name of the CloudWatch log group where you can find logs written by your Lambda function.
    */
  val logGroupName: java.lang.String
  /**
    * The name of the CloudWatch log group where you can find logs written by your Lambda function.
    * The log stream may or may not change for each invocation of the Lambda function.
    *
    * The value is null if your Lambda function is unable to create a log stream, which can happen
    * if the execution role that grants necessary permissions to the Lambda function does not
    * include permissions for the CloudWatch actions.
    */
  val logStreamName: java.lang.String
  /**
    * Memory limit, in MB, you configured for the Lambda function. You set the memory limit at the
    * time you create a Lambda function and you can change it later.
    */
  val memoryLimitInMB: java.lang.String
  /**
    * Returns the approximate remaining execution time (before timeout occurs) of the Lambda
    * function that is currently executing. The timeout is one of the Lambda function
    * configuration. When the timeout reaches, AWS Lambda terminates your Lambda function.
    *
    * You can use this method to check the remaining time during your function execution and take
    * appropriate corrective action at run time.
    */
  def getRemainingTimeInMillis(): java.lang.String
}

object Context {
  @scala.inline
  def apply(
    awsRequestId: java.lang.String,
    callbackWaitsForEmptyEventLoop: scala.Boolean,
    clientContext: js.Any,
    functionName: java.lang.String,
    functionVersion: java.lang.String,
    getRemainingTimeInMillis: js.Function0[java.lang.String],
    identity: js.Any,
    invokedFunctionArn: java.lang.String,
    logGroupName: java.lang.String,
    logStreamName: java.lang.String,
    memoryLimitInMB: java.lang.String
  ): Context = {
    val __obj = js.Dynamic.literal(awsRequestId = awsRequestId, callbackWaitsForEmptyEventLoop = callbackWaitsForEmptyEventLoop, clientContext = clientContext, functionName = functionName, functionVersion = functionVersion, getRemainingTimeInMillis = getRemainingTimeInMillis, identity = identity, invokedFunctionArn = invokedFunctionArn, logGroupName = logGroupName, logStreamName = logStreamName, memoryLimitInMB = memoryLimitInMB)
  
    __obj.asInstanceOf[Context]
  }
}

