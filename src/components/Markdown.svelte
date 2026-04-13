<script lang="ts">
    import markdownit from 'markdown-it';
    import markdownit_hightlightjs from 'markdown-it-highlightjs';
    import markdownit_collapsible from "markdown-it-collapsible";
    import markdownit_anchor from 'markdown-it-anchor';

    import hljs from 'highlight.js/lib/core';
    import java from 'highlight.js/lib/languages/javascript';

    import slugify from '@sindresorhus/slugify';

	import { onMount } from 'svelte';

    let { content }: {
        content: string;
    } = $props();

    function convertMarkdownToHTML(markdown: string) {
        hljs.registerLanguage('javascript', java)
        const md = markdownit({ html: true }).use(markdownit_collapsible).use(markdownit_hightlightjs, { hljs }).use(markdownit_anchor, { slugify: s => slugify(s) });
        return md.render(markdown);
    }
</script>

{#if content}
    <div class="markdown-body text-main-text flex flex-col gap-2">
        {@html convertMarkdownToHTML(content)}
    </div>
{:else}
    <p class="text-center">No content to display</p>
{/if}