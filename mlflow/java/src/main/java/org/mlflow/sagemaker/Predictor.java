package org.mlflow.sagemaker;


/**
 * A generic predictor object that provides a uniform interface for model inference. By extending
 * {@link org.mlflow.sagemaker.Predictor}, models of a specific flavor can expose their inference
 * routines for use by generic tools, such as model containers
 */
public abstract class Predictor {
  /** Performs inference on the specified input and produces a result */
  protected abstract DataFrame predict(DataFrame input) throws PredictorEvaluationException;
}
