import tailwindcss from '@tailwindcss/vite';
import { sveltekit } from '@sveltejs/kit/vite';
import { defineConfig, searchForWorkspaceRoot } from 'vite';

export default defineConfig({
	plugins: [sveltekit(), tailwindcss()],
	server: {
		fs: {
			allow: [
				searchForWorkspaceRoot(process.cwd()),
				"/static/question/*",
				"/static/guide/*",
				"/static/cheetsheet/*",
			]
		}
	}
});
