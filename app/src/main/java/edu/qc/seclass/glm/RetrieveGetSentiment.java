package edu.qc.seclass.glm;


import android.os.AsyncTask;

class RetrieveGetSentiment extends AsyncTask<String, Void, String> {

    private Exception exception;
    private String returnscore;
    public String score;

    public String getScore() {
        return returnscore;
    }

    public interface AsyncResponse {
        void processFinish(String output);
    }

    public AsyncResponse delegate = null;

    public RetrieveGetSentiment() {

    }

    public RetrieveGetSentiment(AsyncResponse delegate) {
        this.delegate = delegate;
    }

    protected String doInBackground(String... feeling) {
        String score = "Failed";
        try {
            score = GetSentiment.makeCall(feeling[0]);

        } catch (Exception e) {
            this.exception = e;
        } finally {
        }
        this.score = score;
        return score;
    }

    protected String getScoree() {
        return score;
    }

    @Override
    protected void onPostExecute(String something) {
        delegate.processFinish(something);
    }
}