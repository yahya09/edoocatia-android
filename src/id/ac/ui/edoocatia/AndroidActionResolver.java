package id.ac.ui.edoocatia;

import android.content.Context;
import android.os.Handler;

public class AndroidActionResolver implements ActionResolver {

	private Handler handler;
	private Context uiThread;
	private FetchUrl fetcher;
	
	public Context getUiThread() {
		return uiThread;
	}

	public AndroidActionResolver(Context context, FetchUrl fu) {
		this.handler = new Handler();
		this.uiThread = context;
		this.setFetcher(fu);
	}

	@Override
	public String getString(int resId) {
		return uiThread.getString(resId);
	}

	public FetchUrl getFetcher() {
		return fetcher;
	}

	public void setFetcher(FetchUrl fetcher) {
		this.fetcher = fetcher;
	}

}
