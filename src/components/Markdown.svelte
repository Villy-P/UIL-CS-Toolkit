<script lang="ts">
    let { content }: {
        content: string;
    } = $props();

    function convertMarkdownToHTML(markdown: string) {
        markdown = markdown.replace(/\t/g, '&nbsp;&nbsp;&nbsp;&nbsp;');
        markdown = markdown.replace(/\*\*\*(.*?)\*\*\*/g, '<strong><em>$1</em></strong>');
        markdown = markdown.replace(/\*\*(.*?)\*\*/g, '<strong>$1</strong>');
        markdown = markdown.replace(/\*(.*?)\*/g, '<em>$1</em>');
        markdown = markdown.replace(/`(.*?)`/g, '<code>$1</code>');
        return markdown;
    }
</script>

{#if content}
    <pre class="text-wrap">{@html convertMarkdownToHTML(content)}</pre>
{:else}
    <p class="text-center">No content to display</p>
{/if}